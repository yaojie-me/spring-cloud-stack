package neo.matrix.service.consumer.controller;

import neo.matrix.service.consumer.dto.User;
import neo.matrix.service.consumer.dto.UserNameAndPassword;
import neo.matrix.service.consumer.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user/api")
public class UserController {

    @Resource
    private UserRepository userRepository;

    @GetMapping("hello")
    public String hello(){
        return "I am user";
    }

    @GetMapping("users")
    public List<User> users(){
        return userRepository.findAll();
    }

    @GetMapping("userNameAndPasswords")
    public List<UserNameAndPassword> userNameAndPasswords(){
        return userRepository.findByAccountNonExpired();
    }
}
