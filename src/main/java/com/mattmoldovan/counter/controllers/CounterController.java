package com.mattmoldovan.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {

	@GetMapping("/your_server")
	public String yourServer(HttpSession session ) {
		
		if(session.getAttribute("count")== null) {
			session.setAttribute("count", 1);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count+1);
		}

		return"home.jsp";
	}
	
	@GetMapping("/your_server/two")
	public String yourServerTwo(HttpSession session) {
		
		if(session.getAttribute("count")== null) {
			session.setAttribute("count", 2);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count+2);
		}

		return"byTwo.jsp";
		
	}
	
	@GetMapping("/your_server/clear")
	public String clear(HttpSession session) {
		session.invalidate();
		return "redirect:/your_server/counter";
	}
	
	@GetMapping("/your_server/counter")
	public String yourServerCounter() {
		return"display.jsp";
	}
}
