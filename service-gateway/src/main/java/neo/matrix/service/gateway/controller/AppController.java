package neo.matrix.service.gateway.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@RestController
public class AppController {

    @Resource
    private Environment environment;

    @GetMapping("callInstanceId")
    public Mono<String> callInstanceId(@RequestParam String instanceId){
        String ret = "hi " + instanceId + ", i am " + environment.getProperty("spring.cloud.consul.discovery.instance-id");
        return Mono.just(ret);
    }
}
