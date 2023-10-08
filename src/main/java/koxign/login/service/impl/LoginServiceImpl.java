package koxign.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import koxign.login.service.LoginService;
import koxign.login.service.LoginVO;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginMapper loginMapper;
	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
	//회원로그인
	public LoginVO actionLogin(LoginVO vo)throws Exception{
		
//		// 입력한 비밀번를 암호화한다.
//		String encodedPassword = passwordEncoder.encode(vo.getPartnerPwd());
//		vo.setPartnerPwd(encodedPassword);
		
		//아이디와 암호화된 비밀번호가 DB가 일치하는지 확인한다.
		LoginVO loginVO = loginMapper.actionLogin(vo);
		
		if (loginVO != null && !loginVO.getPartnerEmail().equals("") && !loginVO.getPartnerPwd().equals("")) {
			return loginVO;
		} else {
			loginVO = new LoginVO();
		}
		
		return loginVO;
	}
				
}