package springboot.demo.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import springboot.demo.controller.UserController;

@SpringBootTest
public class UserControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void testGetUser() throws Exception {
        /**
         * .andReturn().getResponse().getContentAsString();  获取返回信息并以字符串形式输出
         */
        String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/getUser")).andReturn().getResponse()
                .getContentAsString();
        System.out.println("result : " + responseString);
    }

}
