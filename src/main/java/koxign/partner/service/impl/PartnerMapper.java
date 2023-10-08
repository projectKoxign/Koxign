package koxign.partner.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.ui.ModelMap;

import koxign.partner.service.PartnerVO;



@Mapper
public interface PartnerMapper {
	
	//ȸ�� IDã��
	PartnerVO findpartnerEmail(PartnerVO vo) throws Exception;
	
	//ȸ����й�ȣ ã��
	PartnerVO findpartnerPwd(PartnerVO vo) throws Exception;
	
	//ȸ����й�ȣ������Ʈ
	void partnerPwdUpdate(PartnerVO vo) throws Exception;
	
	//ȸ�����
	List selectpartnerList(PartnerVO vo) throws Exception;
	
	//ȸ����� ��
	int selectPartnerListCnt (PartnerVO vo) throws Exception;
	
	//ȸ����
	ModelMap selectpartner (PartnerVO vo) throws Exception;
}
