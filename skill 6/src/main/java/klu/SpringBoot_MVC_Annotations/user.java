package klu.SpringBoot_MVC_Annotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
@ResponseBody
@RequestMapping("/controller")

public class user {
	@GetMapping("/Welcome")
	//@ResponseBody
	public String display() {
		return "Welcome Controller";
	}
	
	@GetMapping("/d1")
	//@ResponseBody	
	public String display1() {
		return "Controller from display1 method";
	}
	
	@GetMapping("/d2")
	//@ResponseBody	
	public String display2() {
		return "Controller from display2 method";
	}
	
	@GetMapping("/d3")	
	public int display3() {
		return 10;
	}
	
	
	//with parameter name @requestParam   http://localhost:8080/controller/d9?id=11
	
	@GetMapping("/d9")
	public int display9(@RequestParam("id") int uid) {
		return uid;
	}
	
	@GetMapping("/d11")
	public int display11(@RequestParam("i")int a, @RequestParam("j") int b) {
		return a+b;
	}
	
	
	//without parameter name @PathVariable    http://localhost:8080/controller/d10/100
	
	@GetMapping("/d10/{eid}")
	public int display10(@PathVariable("eid")int uid1) {
		return uid1;
	}
	
	@GetMapping("/d12")
	public String display12(@RequestParam("n") String name) {
		return name;
	}
	
	
	
	
	@GetMapping("/d4")
	//@ResponseBody	
	public String display4() {
		return "Controller from display4 method";
	}
	
	@GetMapping(value="/d5")
	//@ResponseBody	
	public String display5() {
		return "Controller from display5 method";
	}
	
	@GetMapping(path="/d6")
	//@ResponseBody	
	public String display6() {
		return "Controller from display6 method";
	}
	
	

	

}
