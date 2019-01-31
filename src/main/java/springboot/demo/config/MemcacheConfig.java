package springboot.demo.config;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.utils.AddrUtil;
import springboot.demo.properties.XMemcachedProperties;

@Configuration
public class MemcacheConfig {
    
    private static Logger logger = LoggerFactory.getLogger(MemcacheConfig.class);
    
    @Autowired
    private XMemcachedProperties xMemcachedProperties;
    
    @Bean
    public MemcachedClient getMemcachedClient(){
        MemcachedClient memcachedClient = null;
        try {
            MemcachedClientBuilder builder = new XMemcachedClientBuilder(AddrUtil.getAddresses(xMemcachedProperties.getServers()));
            builder.setConnectionPoolSize(xMemcachedProperties.getPoolSize());
            builder.setOpTimeout(xMemcachedProperties.getOpTimeout());
            memcachedClient = builder.build();
        } catch (IOException e) {
            logger.error("init MemcachedClient failed ",e);
        }
        return memcachedClient;
    }
    
}
