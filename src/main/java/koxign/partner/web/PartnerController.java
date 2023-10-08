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
public class PartnerController {
	final String path ="partner/";
	
	@Autowired
	PartnerService service;
	
	//회원 ID찾기
	@RequestMapping("/partner/findId.do")
	//@RequestMapping다양한 유형(GET, POST, PUT, DELETE 등)의 HTTP 요청에 메서드를 매핑하는 데 사용할 수 있는 보다 일반적인 용도의 주석입니다.
	//@GetMappingHTTP GET 요청을 컨트롤러의 특정 메서드에 매핑하는 데 사용됩니다.
	//@RequestMapping(method = RequestMethod.GET), HTTP GET 요청만 명시적으로 처리한다는 의미입니다.
	public String findId(@ModelAttribute("searchVO")PartnerVO vo, ModelMap model,
			HttpSession session)throws Exception{
		
		return "/partner/FindId";
	}
	
	//회원 ID찾기 완료
	@RequestMapping("/partner/findIdComplete.do")
	public String findIdComplete(@ModelAttribute("searchVO")PartnerVO vo, ModelMap model,
			HttpSession session)throws Exception{
		
		PartnerVO result = service.findpartnerEmail(vo);
		if(result == null || result.getPartnerEmail().isEmpty()) {
			model.addAttribute("message","가입된 회원정보가 없습니다.");
			
			 return "forward:/partner/findId.do";
		}
		model.addAttribute("result",result);
		
		return "/partner/FindIdComplete";
		
	}
	
	//회원비밀번호 찾기
	@RequestMapping("/partner/findPassword.do")
	public String findPassword(@ModelAttribute("searchVO")PartnerVO vo, ModelMap model,
			HttpSession session)throws Exception{
		
		return "/partner/FindPassword";
	}
	
	//회원비밀번호 수정
	@RequestMapping("//partnerfindPasswordRegist.do")
	public String findPasswordRegist(@ModelAttribute("searchVO")PartnerVO vo, ModelMap model,
			HttpSession session)throws Exception{
		
		PartnerVO result = service.findpartnerPwd(vo);
		if(result == null || result.getPartnerEmail().isEmpty()) {
			model.addAttribute("message","가입된 회원정보가 없습니다.");
			
			 return "forward:/partner/findPasswordRegist.do";
		}
		model.addAttribute("result",result);
		
		
		return "/partner/FindPasswordRegist";
	}
	
	//회원비밀번호 업데이트
	@RequestMapping("/partner/findPasswordComplete.do")
	public String findPasswordComplete(@ModelAttribute("searchVO")PartnerVO vo, ModelMap model,
			HttpSession session)throws Exception{
		service.partnerPwdUpdate(vo);
		model.addAttribute("loginMessage","비밀번호가 업데이트 되었습니다.");
		
		return "forward:/login/login.do";
	}
	
	
	
	
}