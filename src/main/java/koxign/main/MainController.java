package koxign.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import koxign.join.service.JoinService;
import koxign.join.service.JoinVO;

@Controller
public class MainController {

	@Autowired
	private JoinService joinService;
	
	@GetMapping("/main")
	public String main() {
		
		return "/main";
	}
	
	@GetMapping("/")
	String index(HttpSession session, Model model) {
		String msg = (String) session.getAttribute("msg");
		
		if(msg != null) {
			model.addAttribute("msg", msg);
			session.removeAttribute("msg");
		}
		
		return "main";
	}
	@RequestMapping(value = "join/join.do")
	public String siteUseAgree(@ModelAttribute("searchVO") JoinVO vo, HttpServletRequest request, 
		ModelMap model, HttpSession session) throws Exception{
		return "join/join";
	}
	
}
