package com.leyou.httpdemo;

import com.leyou.httpdemo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HttpDemoApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void httpGet() {
        User user = restTemplate.getForObject("http://localhost:8088/user/17", User.class);
        System.out.println(user);
    }

}
