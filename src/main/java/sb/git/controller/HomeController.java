package sb.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String method() {
	
		System.out.println("Wellcome");
		return null;
	}

}
