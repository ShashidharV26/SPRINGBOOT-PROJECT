package com.appli5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.appli5.modle.User;
import com.appli5.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	@Autowired
	UserService ser;

	@RequestMapping("/input")
	String input() {
		return "input.jsp";
	}

	@RequestMapping("/saveUser")
	String saveUser(User user) {
		System.out.println(user);
		ser.addUser(user);
		return "input.jsp";
	}

	@RequestMapping("/getById")
	String getById(HttpSession h, Integer id) {
		User u = ser.getUser(id);
		if (u != null) {
			h.setAttribute("message", u);
			return "show.jsp";
		}
		return "error.jsp";
	}

	@RequestMapping("/getAllUsers")
	@ResponseBody
	List<User> getAllUsers(HttpSession h, User u) {
		List<User> user1 = ser.getAllData(u);
		return user1;

	}

	@RequestMapping("/deleteById")
	String deleteById(HttpSession h, int id) {
		ser.deleteById(id);
		h.setAttribute("message", id);
		return "delete.jsp";
	}

	@RequestMapping("/updateById")
	String updateById(User u, int id) {
		System.out.println("update");
		ser.updateUser(u, id);
		return "result.jsp";
	}
}
