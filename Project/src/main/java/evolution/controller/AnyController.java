package evolution.controller;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import evolution.controller.dto.RequestDto;

@RestController
public class AnyController {
	@GetMapping("/get")
	public String get() {
		String message = "Hello World";
		System.out.println(message);
		return message;
	}
	
	@PostMapping("/post/parameter")
	public String postParameter(HttpServletRequest request) {
		Map<String, String[]> map = request.getParameterMap();
		for (Entry<String, String[]> entry : map.entrySet())  {
			System.out.println(entry.getKey() + " : " + Arrays.asList(entry.getValue()));
		}
		return null;
	}
	
	@PostMapping("/post")
	public String post(@RequestBody RequestDto requestDto, HttpServletRequest request) {
		System.out.println(requestDto);
		return null;
	}
}
