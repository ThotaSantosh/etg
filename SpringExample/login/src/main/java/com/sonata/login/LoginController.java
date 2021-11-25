package com.sonata.login;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


	

import com.sonata.loginform.LoginForm;
	@SpringBootApplication
	@Controller
	public class LoginController {

	    @RequestMapping("/home")
	    public String showForm(LoginForm loginForm) {
	        return "login";
	    }

	    @RequestMapping("/index")
	    public String validateUser(@RequestParam("username") String username,@RequestParam("password") String password, Model model) {
	    model.addAttribute("username", username);
	    model.addAttribute("password", password);
	    if(username=="santosh"&&password=="9642217") {
	    	return "welcome to home page";
	    }
	    else {
	    return "home";
	    }
	    }
	    }
	    
