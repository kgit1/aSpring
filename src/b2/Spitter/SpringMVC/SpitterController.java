package b2.Spitter.SpringMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import b2.Spitter.SpringMVC.Service.SpitterService;

//show to spring that this is controller class
@Controller
// root mapping for all controllers in this file
@RequestMapping("/spitter")
public class SpitterController {
	
	private final SpitterService spitterService;
	
	@Autowired
	public SpitterController(SpitterService spitterService) {
		this.spitterService=spitterService;
	}

}
