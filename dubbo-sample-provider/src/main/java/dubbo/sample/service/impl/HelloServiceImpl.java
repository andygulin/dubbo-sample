package dubbo.sample.service.impl;

import dubbo.sample.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "hello : " + name;
	}
}