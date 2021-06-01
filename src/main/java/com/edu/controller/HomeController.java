package com.edu.controller;

import java.util.StringTokenizer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 이 클래스는 MVC웹 프로젝트(스프링)를 최초로 생성시 자동으로 생성되는 클래스입니다.
 * 웹브라우저의 요청사항을 view단(jsp)에 연결시켜주는 클래스가 @Controller
 * 스프링에서 관리하는 클래스를 스프링빈(콩) = 스프링빈을 명시 @Controller 애노테이션
 * Beans(콩들) 그래프로 이 프로젝트의 규모 확인 가능
 * 스프링이 관리하는 클래스는 파일아이콘에 S가 붙는다.
 */
                        
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {		
		String jspVar = "@서비스에서 처리한 결과";
		
		String sentence = "SpringTokenizer Test";
		String[] tokens = sentence.split(" ");
		
		model.addAttribute("tokens", tokens);
		model.addAttribute("jspObject", jspVar);
		
		return "home";
	}
	
}
