package koxign.login.service.impl;

import org.apache.ibatis.annotations.Mapper;

import koxign.login.service.LoginVO;

@Mapper
public interface LoginMapper{

	//일반 로그인을 처리한다
	public LoginVO actionLogin(LoginVO vo) throws Exception;
}
