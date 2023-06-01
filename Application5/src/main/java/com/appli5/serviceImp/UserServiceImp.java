package com.appli5.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appli5.modle.User;
import com.appli5.repo.UserRepo;
import com.appli5.service.UserService;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserRepo repo;

	@Override
	public User addUser(User user) {
		return repo.save(user);
	}

	@Override
	public User getUser(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<User> getAllData(User u) {
		return repo.findAll();
	}

	@Override
	public void deleteById(int id) {
		User user = repo.findById(id).orElse(null);
		if (user != null) {
			repo.deleteById(id);
		}

	}

	@Override
	public void updateUser(User u, int id) {
		System.out.println("service");
		List<User> user = repo.findAll();
		for (User u1 : user) {
			if (u1.getId() == id) {
				u1.setName(u.getName());
				u1.setEmail(u.getEmail());
				u1.setPhno(u.getPhno());
				repo.save(u1);
			}
		}
	}

}
