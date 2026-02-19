package klu.SpringBoot_MVC_Annotations;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody

public class user_html {
	
	@GetMapping("/html")
	public String gethtml() {
		return "index";
	}
	

}
