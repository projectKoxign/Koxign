<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Language" content="ko">
<meta http-equiv="X-UA-Compatible" content="IE-edge"/>
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
<title>회원가입</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
<a href="main.html" class="d-block auth-logo">
   <img src="../resources/assets/img/koxign-logo.png" alt="koxign" height="80"> <span class="logo-txt"></span>
</a>
<h2 class="icon1">API 발급페이지</h2>
<p class="mB20">API 발급을 위해 아래의 정보를 입력해 주십시오. <br class="m-block"/><strong class="star">*</strong>표시는 필수 입력사항입니다.</p>

<h3 class="icon2 hidden">기본정보</h3>
<form id="frm" name="frm" method="post" action="/api/insertMember.do" onsubmit="return regist();">
	<input type="hidden" id="idCheckAt" value="N"/>
	
	<table class="api_chart">
		
		<colgroup>
			<col style="width:200px"/>
			<col/>
		</colgroup>
		<tbody>
			<tr>
				<th><strong class="star">*</strong><label for="partnerCo">사이트 명</label></th>
				<td>
					<input type="text" id="partnerCo" name="partnerCo" required/>
					<a href="#" id="btn-id-check" class="btn-sm spot fn" title="중복확인(새창열림)"><span>중복확인</span></a>
				</td>
			</tr>
			<tr>
				<th><strong class="star">*</strong><label for="partnerNm">사업자 명</label></th>
				<td>
					<input type="text" id="partnerNm" name="partnerNm" required/>
					<a href="#" id="btn-id-check" class="btn-sm spot fn" title="중복확인(새창열림)"><span>중복확인</span></a>
				</td>
			</tr>
		</tbody>
	</table>
	<div class="agree_all">
	<label><input type="checkbox" id="check_all"/>서비스 이용이 제한되는 카테고리, 금지된 행동 관련 운영 정책을 위반하지 않는 앱입니다.</label>
	</div>	
	<div class="btn-cont ac">
		<button type="button" onclick="location.href='main.jsp' ">취소</button>
		<button type="submit" class="btn spot">저장</button>
	</div>
</form>

</body>
</html>
