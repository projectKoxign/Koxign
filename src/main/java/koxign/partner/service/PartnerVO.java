package koxign.partner.service;

import java.util.Date;

public class PartnerVO {
	//아이디
	private String partnerEmail;
	
	//이름
	private String partnerNm;
	
	//비밀번호
	private String partnerPwd;
	
	//회사명
	private String partnerCo;
	
	//사용자상태코드
	private String partnerSttusCode;
	
	//회원고유번호
	private int partnerNo;
	
	//가입일자
	private java.util.Date partnerCreatAt;
	
	//getter&setter
	public String getPartnerEmail() {
		return partnerEmail;
	}

	public void setPartnerEmail(String partnerEmail) {
		this.partnerEmail = partnerEmail;
	}

	public String getPartnerNm() {
		return partnerNm;
	}

	public void setPartnerNm(String partnerNm) {
		this.partnerNm = partnerNm;
	}

	public String getPartnerPwd() {
		return partnerPwd;
	}

	public void setPartnerPwd(String partnerPwd) {
		this.partnerPwd = partnerPwd;
	}

	public String getPartnerCo() {
		return partnerCo;
	}

	public void setPartnerCo(String partnerCo) {
		this.partnerCo = partnerCo;
	}

	public String getPartnerSttusCode() {
		return partnerSttusCode;
	}

	public void setPartnerSttusCode(String partnerSttusCode) {
		this.partnerSttusCode = partnerSttusCode;
	}

	public int getPartnerNo() {
		return partnerNo;
	}

	public void setPartnerNo(int partnerNo) {
		this.partnerNo = partnerNo;
	}

	public java.util.Date getPartnerCreatAt() {
		return partnerCreatAt;
	}

	public void setPartnerCreatAt(java.util.Date partnerCreatAt) {
		this.partnerCreatAt = partnerCreatAt;
	}
	
	


	

}
