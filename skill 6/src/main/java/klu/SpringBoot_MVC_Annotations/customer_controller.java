package klu.SpringBoot_MVC_Annotations;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController



public class customer_controller {
	@GetMapping("/customer")
	public customer getcustomer() {
		
		customer c = new customer("akhil","vijayawada");
		return c;
		
	}

}
