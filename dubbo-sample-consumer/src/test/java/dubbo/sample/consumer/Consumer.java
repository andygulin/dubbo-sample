package dubbo.sample.consumer;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import dubbo.sample.bean.User;
import dubbo.sample.service.HelloService;
import dubbo.sample.service.UserService;

@ContextConfiguration(locations = "classpath:consumer.xml")
public class Consumer extends AbstractJUnit4SpringContextTests {

	@Autowired
	private HelloService helloService;
	@Autowired
	private UserService userService;

	@Test
	public void hello() {
		System.out.println(helloService.hello("andy"));
	}

	@Test
	public void user() {
		User user = userService.getUser(1);
		System.out.println(user);
		List<User> users = userService.getUserList();
		System.out.println(users);
	}
}
