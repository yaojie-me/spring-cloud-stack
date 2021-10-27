package neo.matrix.service.consumer.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/app/api")
public class AppController {

    @Resource
    private Environment environment;

    @GetMapping("callInstanceId")
    public String callInstanceId(@RequestParam String instanceId){
        return "hi " + instanceId + ", i am " + environment.getProperty("spring.cloud.consul.discovery.instance-id");
    }

    @GetMapping("hello")
    public String hello(){
        return "I am app";
    }
}
