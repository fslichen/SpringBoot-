package evolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnotherController {
	@GetMapping("/dispatch")
	public String dispatch() {
		return "evolution.html";// Dispatch to evolution.html without changing the URL.
	}
}
