package koxign.partner.web;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import koxign.partner.service.PartnerService;
import koxign.partner.service.PartnerVO;



@Controller
@RequestMapping("/partner")
public class PartnerController {
	final String path ="partner/";
	
	@Autowired
	PartnerService service;
	
	//회원 ID찾기
	@GetMapping("/findId.do")
	public String findId(@ModelAttribute("searchVO")PartnerVO vo, ModelMap model,
			HttpSession session)throws Exception{
		
		return "/partner/FindId";
	}
	
	//회원 ID찾기 완료
	@GetMapping("/findIdComplete.do")
	public String findIdComplete(@ModelAttribute("searchVO")PartnerVO vo, ModelMap model,
			HttpSession session)throws Exception{
		
		
		return "/partner/FindIdComplete";
		
	}
	
	//회원비밀번호 찾기
	@GetMapping("/findPassword.do")
	public String findPassword(@ModelAttribute("searchVO")PartnerVO vo, ModelMap model,
			HttpSession session)throws Exception{
		
		return "/partner/FindPassword";
	}
	
	//회원비밀번호 수정
	@GetMapping("/findPasswordRegist.do")
	public String findPasswordRegist(@ModelAttribute("searchVO")PartnerVO vo, ModelMap model,
			HttpSession session)throws Exception{
		
		
		
		return "forward:/login/login.do";
	}
	
	//회원비밀번호 업데이트
	@GetMapping("/findPasswordComplete.do")
	public String findPasswordComplete(@ModelAttribute("searchVO")PartnerVO vo, ModelMap model,
			HttpSession session)throws Exception{
		service.partnerPwdUpdate(vo);
		model.addAttribute("loginMessage","비밀번호가 업데이트 되었습니다.");
		
		return "/partner/FindPasswordRegist";
	}
	
	
	
	
}