package springboot.demo.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import springboot.demo.model.DemoConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigurationTest {

    @Value("${demo.title}")
    private String title;

    @Resource
    private DemoConfiguration demo;

    /**
     * 通过注解@value获取配置文件属性值
     */
    @Test
    public void test1() {
        System.out.println(title);
    }

    /**
     * 自定义配置文件对象
     */
    @Test
    public void test2() {
        System.out.println(demo.getTitle());
        System.out.println(demo.getDescription());
    }

}
