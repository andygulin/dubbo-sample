package dubbo.sample.provider;

import java.io.IOException;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = "classpath:provider.xml")
public class Provider extends AbstractJUnit4SpringContextTests {

	@Test
	public void start() throws IOException {
		System.in.read();
	}
}
