package springBoot.dataBase.project.api.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String getHome()
	{
		System.out.println("Inside getHome");
		return "home";
	}

}
