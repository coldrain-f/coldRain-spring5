package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/examples", method = RequestMethod.GET)
public class ExampleController {

	@RequestMapping(value = "/example01", method = RequestMethod.GET)
	public String example01(String user_id, String user_password, Model model) {
		System.out.println("ExampleController.example01");
		
		System.out.println("user_id = " + user_id);
		System.out.println("user_password = " + user_password);
		
		model.addAttribute("user_id", user_id);
		model.addAttribute("user_password", user_password);
		
		return "examples/example01";
	}
	
	@RequestMapping(value = "/example02", method = RequestMethod.GET)
	public String example02(@RequestParam String user_id, 
							@RequestParam String user_password,
							Model model) {
		System.out.println("ExampleController.example02");
		
		System.out.println("user_id = " + user_id);
		System.out.println("user_password = " + user_password);
		
		model.addAttribute("user_id", user_id);
		model.addAttribute("user_password", user_password);
		
		//@RequestParam을 쓰던, 안 쓰던 view에서 사용하려면 model에 담아줘야 한다.
		//@RequestParam을 붙여준 파라미터는 반드시 주입되어야 한다. 주입되지 않으면 400번 에러가 발생한다.
		
		return "examples/example02";
	}
}
