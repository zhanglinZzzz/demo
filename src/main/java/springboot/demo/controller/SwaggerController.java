package springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;

@Api(value = "swagger", description = "swagger测试", position = 100, protocols = "http")
@Controller
@RequestMapping("/swagger")
public class SwaggerController {

    @RequestMapping("/test")
    @ResponseBody
    public Boolean test() {
        return true;
    }

}
