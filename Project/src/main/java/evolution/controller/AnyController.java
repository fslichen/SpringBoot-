package evolution.controller;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnyController {
	@GetMapping("/get")
	public String get() {
		String message = "Hello World";
		System.out.println(message);
		return message;
	}
	
	@PostMapping("/post/parameter")
	public String post(HttpServletRequest request) {
		Map<String, String[]> map = request.getParameterMap();
		for (Entry<String, String[]> entry : map.entrySet())  {
			System.out.println(entry.getKey() + " : " + Arrays.asList(entry.getValue()));
		}
		return null;
	}
}
