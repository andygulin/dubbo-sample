package dubbo.sample.service;

import java.util.List;

import dubbo.sample.bean.User;

public interface UserService {

	User getUser(Integer id);

	List<User> getUserList();
}
