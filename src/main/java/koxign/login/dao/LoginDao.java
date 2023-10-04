package koxign.login.dao;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import koxign.login.service.LoginVO;


@Mapper
public interface LoginDao {

	
	@Autowired
	
	 // 01_01. 회원 로그인 체크
	public boolean actionLogin(LoginVO vo); 
	// 01_02. 회원 로그인 정보
	public  LoginVO viewLogin(LoginVO vo);
	    // 02. 회원 로그아웃
	public void logout(HttpSession session);
	
}
