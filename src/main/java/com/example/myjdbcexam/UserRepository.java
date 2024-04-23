package com.example.myjdbcexam;

import java.util.List;

public interface UserRepository {

	void create(User user);
	
	List<User> readlist();
	
	User readdetail(String uno);
	
	void update(User user);
	
	void delete(String uno);
	
}
