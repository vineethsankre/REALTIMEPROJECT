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
		
		
		
		
		return "Congratulation DevOps Engineers ! Cloud and DevOps Engineer jobs are recession proof .. keep working hard and there is light at the end of tunnel.  All the Best for your bright futute !!! From Springboot Java Application"; //"application/json" mean this is a text not a redirect
	}
}
