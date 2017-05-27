package dubbo.sample.consumer.controller;

import dubbo.sample.bean.User;
import dubbo.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> getList() {
        return userService.getUserList();
    }

    @GetMapping("/get/{id}")
    public User get(@PathVariable("id") int id) {
        return userService.getUser(id);
    }
}