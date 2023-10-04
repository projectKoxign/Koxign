package koxign.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	
	
	@GetMapping("/member/findId.do")
	public String findId(){
		
		return "/member/FindId";
	}
}
