package com.sonata.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView sayHello() {
		ModelAndView mav = new ModelAndView("hello");
		//do some business logic
		mav.addObject("msg", "Hello Santosh");
		return mav;
	}
}