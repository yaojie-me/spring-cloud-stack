package neo.matrix.service.consumer.controller;

import neo.matrix.service.consumer.ServiceConsumerApplication;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.net.URI;

@WebAppConfiguration
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ServiceConsumerApplication.class)
public class UserControllerTest {

    private MockMvc mockMvc;

    @Resource
    private WebApplicationContext webApplicationContext;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void users() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/api/users")).andReturn();
        String contentAsString = mvcResult.getResponse().getContentAsString();
        System.out.println(contentAsString);
        Assert.notNull(contentAsString,"not null");
    }

    @Test
    public void userNameAndPasswords() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/api/userNameAndPasswords")).andReturn();
        String contentAsString = mvcResult.getResponse().getContentAsString();
        System.out.println(contentAsString);
        Assert.notNull(contentAsString,"not null");
    }
}