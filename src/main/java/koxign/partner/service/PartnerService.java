package koxign.partner.service;

import java.util.List;

import org.springframework.ui.ModelMap;


public interface PartnerService {
	
	//회원ID찾기
	public PartnerVO findpartnerEmail(PartnerVO vo) throws Exception;
	
	//회원비밀번호찾기
	public PartnerVO findpartnerPwd(PartnerVO vo) throws Exception;
	
	//회원비밀번호업데이트
	void partnerPwdUpdate(PartnerVO vo) throws Exception;
	
	//회원목록
	public List selectpartnerList(PartnerVO vo) throws Exception;
	
	//회원목록수
	public int selectPartnerListCnt (PartnerVO vo) throws Exception;
	
	//회원상세
	ModelMap selectpartner (PartnerVO vo) throws Exception;
}
