package mdettlaff.gpstracker.server.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class HomeController {

	@RequestMapping
	public String home() {
		return "index";
	}
}