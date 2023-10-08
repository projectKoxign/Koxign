package koxign.partner.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import koxign.partner.service.PartnerService;
import koxign.partner.service.PartnerVO;

@Service
public class PartnerServiceImpl implements PartnerService {
	
	@Autowired
	private PartnerMapper partenerMapper;
	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
	   //회원 ID찾기
		public PartnerVO findpartnerEmail(PartnerVO vo) throws Exception{
		   return partenerMapper.findpartnerEmail(vo);
	   }
	   
	   //회원비밀번호 찾기
		public PartnerVO findpartnerPwd(PartnerVO vo) throws Exception{
		   return partenerMapper.findpartnerPwd(vo);
	   }
	   
		//회원비밀번호업데이트
		public void partnerPwdUpdate(PartnerVO vo) throws Exception{
//			//입력한 비밀번호를 암호화한다
//			String encodedPassword = passwordEncoder.encode(vo.getPartnerPwd());			
//			vo.setPartnerPwd(encodedPassword);
//			
			partenerMapper.partnerPwdUpdate(vo);
		}
		
		//회원목록
		public List selectpartnerList(PartnerVO vo) throws Exception{
			return partenerMapper.selectpartnerList(vo);
		}
		
			
		//회원목록 수
		public int selectPartnerListCnt (PartnerVO vo) throws Exception{
			return partenerMapper.selectPartnerListCnt(vo);
		}
		
		//회원상세
		public ModelMap selectpartner (PartnerVO vo) throws Exception{
			return partenerMapper.selectpartner(vo);
		}

}
