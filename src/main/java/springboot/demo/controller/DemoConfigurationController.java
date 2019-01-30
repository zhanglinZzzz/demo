package springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import springboot.demo.model.DemoConfiguration;

@Controller
public class DemoConfigurationController {

    @Autowired
    private DemoConfiguration demoConfiguration;

    @RequestMapping("/gotoDemoConfigurationPage")
    public String gotoDemoConfigurationPage(ModelMap modelMap) {
        modelMap.put("title", demoConfiguration.getTitle());
        modelMap.put("description", demoConfiguration.getDescription());
        return "demoConfiguration";
    }

}
