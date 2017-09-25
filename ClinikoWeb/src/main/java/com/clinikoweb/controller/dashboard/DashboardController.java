package com.clinikoweb.controller.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DashboardController {

	@RequestMapping("/")
	   public String index() {
	      return "index";
	   }

	@RequestMapping("/dashboard")
	   public String dashboard() {
	      return "dashboard";
	   }

	   @PostMapping("/hello")
	   public String sayHello(@RequestParam("name") String name, Model model) {
	      model.addAttribute("name", name);
	      return "hello";
	   }
}
