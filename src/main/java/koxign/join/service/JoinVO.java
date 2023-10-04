package koxign.join.service;

public class JoinVO {
	//아이디
		private String PartnerEmail;
		
		//이름
		private String PartnerNm;
		
		//비밀번호
		private String PartnerPwd;

		public String getPartnerEmail() {
			return PartnerEmail;
		}

		public void setPartnerEmail(String partnerEmail) {
			PartnerEmail = partnerEmail;
		}

		public String getPartnerNm() {
			return PartnerNm;
		}

		public void setPartnerNm(String partnerNm) {
			PartnerNm = partnerNm;
		}

		public String getPartnerPwd() {
			return PartnerPwd;
		}

		public void setPartnerPwd(String partnerPwd) {
			PartnerPwd = partnerPwd;
		}
		
}
