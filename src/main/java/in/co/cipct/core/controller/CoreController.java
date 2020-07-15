package in.co.cipct.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoreController {


	@GetMapping("/")
	public String hello(){
		return "hello world";
	}
	
    @GetMapping("/about")
    public String about(){
    	return "index";
    }
}

