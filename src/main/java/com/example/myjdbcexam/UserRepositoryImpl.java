package com.example.myjdbcexam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(User user) {
		String sql = "INSERT INTO user (uid, upw) "
				  + "VALUES(?,?)";
	jdbcTemplate.update(sql, user.getUid(), user.getUpw());
	}

	@Override
	public List<User> readlist() {
		String sql = "SELECT * FROM user";

		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
	}


	@Override
	public User readdetail(String uno) {
		String sql = "SELECT * FROM user WHERE uno=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {uno}, new BeanPropertyRowMapper<>(User.class));
	}

	@Override
	public void update(User user) {
		String sql = "UPDATE user SET uid=?, upw=? "
				   + "WHERE uno=?";
		jdbcTemplate.update(sql, 
				user.getUid(), user.getUpw(), user.getUno());
	}

	@Override
	public void delete(String uno) {
		String sql = "DELETE FROM user WHERE uno=?";
		jdbcTemplate.update(sql, uno);
	}

}
