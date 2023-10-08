package koxign.partner.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.ui.ModelMap;

import koxign.partner.service.PartnerVO;



@Mapper
public interface PartnerMapper {
	
	//회원 ID찾기
	PartnerVO findpartnerEmail(PartnerVO vo) throws Exception;
	
	//회원비밀번호 찾기
	PartnerVO findpartnerPwd(PartnerVO vo) throws Exception;
	
	//회원비밀번호업데이트
	void partnerPwdUpdate(PartnerVO vo) throws Exception;
	
	//회원목록
	List selectpartnerList(PartnerVO vo) throws Exception;
	
	//회원목록 수
	int selectPartnerListCnt (PartnerVO vo) throws Exception;
	
	//회원상세
	ModelMap selectpartner (PartnerVO vo) throws Exception;
}
