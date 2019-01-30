package springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注释@RestController表示controller中的方法都以json格式输出，不需要有额外的配置 
 *      相当于@ResponseBody＋@Controller 合在一起的作用
 * 注释@Controller表示controller中的方法输出到页面
 * 
 * @author zhanglin
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello world," + name;
    }
}
