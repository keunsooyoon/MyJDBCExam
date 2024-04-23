package com.example.myjdbcexam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void create(User user) {
		userRepository.create(user);
	}

	@Override
	public List<User> readlist() {
		return userRepository.readlist();
	}

	@Override
	public User readdetail(String uno) {
		return userRepository.readdetail(uno);
	}

	@Override
	public void update(User user) {
		userRepository.update(user);

	}

	@Override
	public void delete(String uno) {
		userRepository.delete(uno);


	}
}
