package koxign.login.dao.impl;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;

import koxign.login.dao.LoginDao;
import koxign.login.service.LoginVO;

@Repository
public class LoginDaoImpl implements LoginDao{

	@Override
	public boolean actionLogin(LoginVO vo) {
		
		return false;
	}

	@Override
	public LoginVO viewLogin(LoginVO vo) {

		return null;
	}

	@Override
	public void logout(HttpSession session) {
		
		
	}

}
