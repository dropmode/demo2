package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminpageController {

	@GetMapping("/adminPage")
	public String adminPage() {
		return "adminPage";
	}
}
