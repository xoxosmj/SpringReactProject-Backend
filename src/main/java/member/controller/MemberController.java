package member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
@RequestMapping(value="member")
public class MemberController {
	
	//@RequestMapping(value="login", method = RequestMethod.GET)
	@GetMapping(value="login")
	@ResponseBody
	public String login() {
		
		return "¿À´×???";
	}
}
