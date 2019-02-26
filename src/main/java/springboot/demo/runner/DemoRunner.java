package springboot.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * CommandLineRunner接口的 Component，会在所有 Spring Beans都初始化之后，SpringApplication.run()之前执行，
 * 非常适合在应用程序启动之初进行一些数据初始化的工作
 * @author zhanglin
 *
 */
@Component
public class DemoRunner implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println("start to init static resource...");
    }

}
