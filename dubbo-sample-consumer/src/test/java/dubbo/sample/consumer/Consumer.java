package dubbo.sample.consumer;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.alibaba.dubbo.common.json.JSON;

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
		String str = helloService.hello("andy");
		System.out.println("HelloService#hello ---------- " + str);
	}

	@Test
	public void user() throws IOException {
		User user = userService.getUser(1);
		System.out.println("HelloService#getUser(1) ---------- " + JSON.json(user));
	}

	@Test
	public void list() throws IOException {
		List<User> users = userService.getUserList();
		System.out.println("HelloService#getUserList ---------- " + JSON.json(users));
	}
}
