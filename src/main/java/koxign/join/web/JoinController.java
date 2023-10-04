package koxign.join.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import koxign.join.service.JoinService;
import koxign.join.service.JoinVO;
import net.sf.json.JSONObject;

@Controller
public class JoinController {
	
	@Autowired
	private JoinService joinService;


	//약관동의 
	@RequestMapping(value = "/join/SiteUseAgree.do")
	public String siteUseAgree(@ModelAttribute("searchVO") JoinVO vo, HttpServletRequest request, 
		ModelMap model, HttpSession session) throws Exception{
		return "join/SiteUseAgree";
	}

	//회원등록 폼
	@RequestMapping(value = "/join/MemberRegist.do")
	public String memberResgit(@ModelAttribute("searchVO") JoinVO vo, HttpServletRequest request, 
		ModelMap model, HttpSession session) throws Exception{
		return "join/join";
	}
	
	//아이디 중복체크
	@RequestMapping(value = "/join/duplicateCheck.do")
	public void duplicateCheck(@ModelAttribute("searchVO") JoinVO vo, HttpServletRequest request, HttpServletResponse response,
		ModelMap model) throws Exception{
		String successYn = "Y";
		String message = "성공";
		
		JSONObject jo = new JSONObject();
		response.setContentType("application/json; charset=utf-8");
		
		jo.put("successYn", successYn);
		jo.put("message", message);
		
		PrintWriter printwriter = response.getWriter();
		printwriter.println(jo.toString()); 
		printwriter.flush();
		printwriter.close();
	}
	
	//회원가입
	@RequestMapping(value = "/join/insertMember.do")
	public String insertMember(@ModelAttribute("searchVO") JoinVO vo, HttpServletRequest request, 
		ModelMap model) throws Exception{
		
		return "join/MemberComplete";
	}
		
}
	

