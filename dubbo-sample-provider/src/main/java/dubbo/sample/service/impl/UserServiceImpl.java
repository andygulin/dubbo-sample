package dubbo.sample.service.impl;

import dubbo.sample.bean.User;
import dubbo.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUser(Integer id) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM user WHERE id=?", BeanPropertyRowMapper.newInstance(User.class), id);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public List<User> getUserList() {
        try {
            return jdbcTemplate.query("SELECT * FROM user", BeanPropertyRowMapper.newInstance(User.class));
        } catch (Exception e) {
            return null;
        }
    }
}