package koxign.partner.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import koxign.partner.dao.PartnerDao;
import koxign.partner.service.PartnerVO;

@Service
public class partnerServiceImpl {
	@Autowired
	PartnerDao dao;
	
	   //회원 ID찾기
		public PartnerVO findpartnerEmail(PartnerVO vo) throws Exception{
		   return memberMapper.findId(vo);
	   }
	   
	   //회원비밀번호 찾기
		public PartnerVO findpartnerPwd(PartnerVO vo) throws Exception{
		   return memberMapper.findPassword(vo);
	   }
	   
		//회원비밀번호업데이트
		public void partnerPwdUpdate(PartnerVO vo) throws Exception{
			//입력한 비밀번호를 암호화한다
			String enpassword = EgovFileScrty.encryptPassword(vo.getPassword(),vo.getEmplyrId());
			vo.setPassword(enpassword);
			
			memberMapper.passwordUpdate(vo);
		}
		
		//회원목록
		public List selectpartnerList(PartnerVO vo) throws Exception{
			return memberMapper.selectMberList(vo);
		}
		
			
		//회원목록 수
		public int selectPartnerListCnt (PartnerVO vo) throws Exception{
			return memberMapper.selectMberListCnt(vo);
		}
		
		//회원상세
		ModelMap selectpartner (PartnerVO vo) throws Exception{
			return memberMapper.selectMber(vo);
		}

}
