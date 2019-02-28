package springboot.demo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
@MapperScan(basePackages = "springboot.demo.mapper2", sqlSessionTemplateRef = "secondarySqlSessionTemplate")
public class SecondDBConfig {
    @Bean(name = "secondaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.secondary")
    public DataSource secondaryDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "secondarySqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("secondaryDataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath:mapper2/*Mapper.xml"));
        return bean.getObject();
    }

    @Bean(name = "secondaryTransactionManager")
    public DataSourceTransactionManager testTransactionManager(
            @Qualifier("secondaryDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "secondarySqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(
            @Qualifier("secondarySqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
