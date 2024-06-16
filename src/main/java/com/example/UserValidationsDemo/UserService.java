package com.example.UserValidationsDemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private Map<Integer, User> userRepository = new HashMap<>();
	private int currentId = 1;
	
	public User createUser(User user) {
		user.setId(currentId++);
		userRepository.put(user.getId(), user);
		return user;
	}
	
	public Map<Integer, User> getAllUsers(){
		return userRepository;
	}
	
	public User getUserById(int id) {
		return userRepository.get(id);
	}
	
	public User updateUserById(int id, User user) {
		user.setId(id);
		userRepository.put(id, user);
		return user;
	}
	
	public void deleteUserById(int id) {
		userRepository.remove(id);
	}
}
