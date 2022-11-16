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
		
		
		
		
		return "Congratulations DevOps Engineers ! Cloud and DevOps Engineer jobs are recession proof.  All the Best for your bright futute !!!   -Madhukiran  7396627149 / 8374343733 "; //"application/json" mean this is a text not a redirect
	}
}
