package springboot.demo.test;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import springboot.demo.controller.HelloController;

/**
 * controller层请求 测试 注解@SpringBootTest 系统自动加载spring boot容器
 * 
 * @author zhanglin
 *
 */
@SpringBootTest
public class HttpTest {

    private MockMvc mockMvc;

    /**
     * 注解@Before 在测试启动的时候优先执行
     * 
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void helloTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/hello?name=zhangsan").accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("zhangsan")));
        ;
    }

}
