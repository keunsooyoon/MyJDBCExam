package com.example.myjdbcexam;

import java.util.List;

public interface UserService {

	//C
	void create(User user);
	
	//R
	List<User> readlist();
	User readdetail(String uno);
	
	//U
	void update(User user);
	
	//D
	void delete(String uno);
	
}
