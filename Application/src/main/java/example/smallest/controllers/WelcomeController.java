package example.smallest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
	public @ResponseBody String helloWorld() {
		
		//Flux
		
		
		
		return '<p style="font-size:24px; font-weight:bold;">🎉 Congratulations DevOps Engineers!!! AWS DevOps is a recession-proof IT Career 💼🚀. All the best for your Bright future 🌟🎯</p>';
// "application/json" means this is a text, not a redirect

		

	}
}
