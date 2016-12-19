package dubbo.sample.service;

import dubbo.sample.bean.User;

import java.util.List;

public interface UserService {

    User getUser(Integer id);

    List<User> getUserList();
}
