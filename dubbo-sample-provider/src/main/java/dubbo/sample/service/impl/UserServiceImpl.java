package dubbo.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import dubbo.sample.bean.User;
import dubbo.sample.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User getUser(Integer id) {
		try {
			User user = jdbcTemplate.queryForObject("SELECT * FROM user WHERE id=?",
					BeanPropertyRowMapper.newInstance(User.class), id);
			return user;
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public List<User> getUserList() {
		try {
			List<User> users = jdbcTemplate.query("SELECT * FROM user", BeanPropertyRowMapper.newInstance(User.class));
			return users;
		} catch (Exception e) {
			return null;
		}
	}
}