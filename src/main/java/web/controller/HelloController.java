package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Whatzzzz UuuuP!");
		messages.add("It's Spring already! Spring is coming! Make road for spring!");
		messages.add("5.3.17 version by april'22 ");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}