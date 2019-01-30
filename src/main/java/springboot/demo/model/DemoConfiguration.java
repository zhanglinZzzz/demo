package springboot.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 注解@ConfigurationProperties 将前缀为perfix的所有配置文件属性赋值到对应属性中
 * 注解@PropertySource配置文件资源路径
 * 
 * @author zhanglin
 *
 */
@Component
@PropertySource(value = "classpath:demo.properties", ignoreResourceNotFound = true, encoding = "UTF-8")
@ConfigurationProperties(prefix = "demotest")
public class DemoConfiguration {

    private String title;

    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
