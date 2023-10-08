package koxign.api.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import koxign.api.service.ApiService;
import koxign.api.service.ApiVO;

@Controller
public class ApiController {
	
	@Autowired
	private ApiService apiService;


	@RequestMapping(value = "/api/apiIssue.do")
	public String apiIssue(@ModelAttribute("searchVO") ApiVO vo, HttpServletRequest request, 
		ModelMap model) throws Exception{
		
		return "api/ApiInfo";
	}
		
}
	

