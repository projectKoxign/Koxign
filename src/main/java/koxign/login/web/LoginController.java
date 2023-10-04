package koxign.login.web;



import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import koxign.login.service.LoginService;
import koxign.login.service.LoginVO;
 
 

@Controller // 현재 클래스를 스프링에서 관리하는 컨트롤러 bean으로 생성
public class LoginController {
	
	
    @Autowired						
    LoginService loginService;
    
    
//    @Autowired 어노테이션: 스프링 프레임워크에서 사용하는 어노테이션 중 하나로, 자동으로 필드, 생성자, 메서드 또는 설정 메서드에 의존성을 주입합니다. 
//	  @Autowired를 사용하면 스프링 컨테이너가 해당 클래스의 객체를 찾아서 주입합니다.
//
//    LoginService: @Autowired로 주입하려는 클래스 또는 빈의 타입입니다. 이 경우 LoginService 클래스의 인스턴스를 주입하려고 합니다.
//
//    의존성 주입(Dependency Injection): 객체 지향 프로그래밍에서 다른 객체에 의존하는 객체를 생성하거나 사용할 때, 
//    이 의존 관계를 클래스 내부에서 직접 생성하는 것이 아니라 외부에서 주입받아 사용하는 방법입니다. 이렇게 하면 코드의 유연성과 테스트 용이성을 향상시킬 수 있습니다.
//
//    @Autowired를 사용하여 의존성을 주입하면 스프링 컨테이너가 해당 타입의 빈을 찾아서 주입합니다. 
//    이로써 LoginService 클래스의 메서드나 필드를 현재 클래스에서 사용할 수 있게 됩니다. 
//    이것은 스프링의 IoC (Inversion of Control) 원칙을 따르는 방식 중 하나이며, 스프링 애플리케이션에서 의존성을 관리하는 데 도움이 됩니다..
//    
    
    
    // 01. 로그인 화면 
    @RequestMapping("/main/login.do")
    public String login(){
        return "/login/Login";    // views/login/Login.jsp로 포워드
    }
    
    //02. 로그인 처리

    @RequestMapping(value = "/login/actionLogin.do")
	public String actionLogin(@ModelAttribute("loginVO") LoginVO loginVO, HttpServletRequest request, ModelMap model) throws Exception {
	
    // 로그인 처리 	actionLogin 메서드를 만든다 ( LoginVO를 @ModelAttribute 을 통해 loginVO로 저장한다.== 사용가능하다. Http  요청, model(데이터저장) 가능하다.
    	  	
    	
    LoginVO resultVO = loginService.actionLogin(loginVO);
   // 따라서 이 코드는 loginService의 actionLogin 메서드를 호출하여 사용자가 입력한 로그인 정보(loginVO)를 전달하고, 
   //로그인 결과를 resultVO에 저장하는 코드입니다. 결과적으로 resultVO에는 로그인에 관련된 정보가 들어 있을 것이며, 개발자는 이 정보를 사용하여 로그인 후의 작업을 수행할 수 있습니다.
    
	if(resultVO != null && resultVO.getPartnerEmail() != null && !resultVO.getPartnerEmail().equals("")) {
		request.getSession().setAttribute("LoginVO", resultVO);
		return "forward:/main";
	} else {
		model.addAttribute("loginMessage","로그인 정보가 올바르지않습니다"); //로그인 정보가 올바르지 않습니다.
		return "forward:/login/Login.do";
	}
	
//		resultVO가 null이 아니고, resultVO의 partnerEmail이 비어 있지 않고, 비어 있지 않은 문자열인 경우:
//
//		세션에 LoginVO 객체를 저장합니다. 이것은 로그인한 사용자의 정보를 세션에 저장하여 나중에 사용할 수 있도록 하는 것입니다.
//		"forward:/main"으로 리다이렉션합니다. 이것은 로그인 성공 후 사용자를 메인 페이지로 리다이렉션합니다.
//		그렇지 않은 경우 (즉, resultVO가 null이거나 resultVO의 partnerEmail이 비어 있거나 비어 있지 않은 문자열이 아닌 경우):
//
//		model 객체에 "로그인 정보가 올바르지 않습니다"라는 메시지를 추가합니다.
//		"forward:/login/Login.do"으로 리다이렉션합니다. 이것은 로그인 정보가 올바르지 않은 경우 사용자를 다시 로그인 페이지로 리다이렉션합니다.
//		쉽게 말해, 이 코드는 로그인이 성공하면 메인 페이지로 이동하고, 실패하면 다시 로그인 페이지로 돌아가는 로그인 로직을 구현하고 있습니다. 로그인 성공 여부는 resultVO 객체와 partnerEmail 속성을 통해 확인됩니다.
//	
	
}
    
  //로그아웃
  	@RequestMapping(value = "/login/actionLogout.do")
  	public String actionLogout(HttpServletRequest request, ModelMap model) throws Exception {
  		
  		request.getSession().invalidate(); // 세션을 무효화 시키는 함수
  		return "forward:main";
  	}
}
 