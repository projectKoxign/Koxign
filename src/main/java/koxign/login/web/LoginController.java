package koxign.login.web;


import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import koxign.join.service.JoinVO;
import koxign.login.service.LoginService;
import koxign.login.service.LoginVO;
 


@Controller // 현재 클래스를 스프링에서 관리하는 컨트롤러 bean으로 생성
public class LoginController {
	
	
    @Autowired						
    LoginService loginService;
    
    
    // 01. 로그인 화면
    @GetMapping("/main/login.do")
    public String login(){
        return "/login/Login";    // views/login/Login.jsp로 포워드
    }
    
    //02. 로그인 처리
    
    @PostMapping("/login/actionLogin.do")
	public String actionLogin(@ModelAttribute LoginVO vo, HttpServletRequest request, ModelMap model) throws Exception {
    	
//    //SNS 로그인
//    if(!StringUtils.isEmpty(vo.getLoginType())) {
//    	if(vo.getLoginType() == "1") 
//    		vo.setLoginType("kakao");
//    		
//    	else if(vo.getLoginType() == "2")
//    			vo.setLoginType("naver");
//    		
//    	else if(vo.getLoginType() == "3")
//    			vo.setLoginType("google");
//    	
//    	}
    	
    LoginVO resultVO = loginService.actionLogin(vo);
   
	if(resultVO != null && resultVO.getPartnerEmail() != null && !resultVO.getPartnerEmail().equals("")) {
		request.getSession().setAttribute("LoginVO", resultVO);
		return "redirect:/main";
	} else {
		model.addAttribute("loginMessage","로그인 정보가 올바르지않습니다"); //로그인 정보가 올바르지 않습니다.
		return "redirect:/login/login";
	}
	
}
    
  //로그아웃
    
    @GetMapping("/login/actionLogout.do")
    public String actionLogout(HttpServletRequest request, ModelMap model) throws Exception {
    	request.getSession().invalidate(); // 세션을 무효화 시키는 함수
    	return "forward:/main";
    }
    
  

}

 