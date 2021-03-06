package com.sonata.login;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {

	@GetMapping("/userform")
	public String index(@ModelAttribute("registration") UserForm registration) {		
		return "index";
	}

	@PostMapping("/userform")
	public String register( @ModelAttribute("registration") UserForm registration, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("error");
			return "index";
		}
		return "success";
	}
}