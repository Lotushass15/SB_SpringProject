package com.example.demo.Authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Login {

	@GetMapping("/login")
	public String login() {
		return "authentication/login";
	}

	@PostMapping("login")
	public String loginCheck(int userId, String password) {
		if (userId == 123 && password.equals("abc")) {
			return "authentication/success";
		} else  {
			return "authentication/login";
		}
	}

}
