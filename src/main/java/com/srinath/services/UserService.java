package com.srinath.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.srinath.model.User;
import com.srinath.repository.UserRepository;

@Service
@Transactional
public class UserService {

		private final UserRepository userRepository;
		
		
		public UserService(UserRepository userRepository) {
			this.userRepository=userRepository;
		}
		
		public void saveMyUser(User user ) {
			userRepository.save(user);
		}
		
//		public List<User> showAllUsers(){
//			List<User> users = new ArrayList<User>();
//			for(User user : userRepository.findAll()) {
//				users.add(user);
//			}
//			
//			return users;
//		}
		
		
		public void deleteMyUser(int id) {
			userRepository.delete(id);
		}
		
		public User editUser(int id) {
			return userRepository.findOne(id);
		}
		public User findByUserid(String userid) {
			return userRepository.findByUserid(userid);
		}
		public User findByUsernameAndPassword(String username, String password) {
			return userRepository.findByUsernameAndPassword(username, password);
		}
		
}

