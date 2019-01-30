package springboot.demo;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springboot.demo.web.filter.MyFilter;

@Configuration
public class WebConfiguration {
    
    @Bean
    public FilterRegistrationBean<Filter> testFilterRegistrationBean(){
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<Filter>();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.setName("MyFilter");
        // 当有多个过滤器时可以通过设置 Order 属性来决定它们的执行顺序，Order 值越小优先级越高。
        registration.setOrder(1);
        return registration;
    }
    
}
