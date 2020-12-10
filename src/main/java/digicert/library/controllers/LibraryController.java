package digicert.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}
