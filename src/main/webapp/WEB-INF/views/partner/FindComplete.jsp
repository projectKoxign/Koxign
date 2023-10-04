<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 class="icon1">아이디 찾기</h2>
<p class="mB20">아래의 사용자 확인 방법 중 하나를 선택하여 회원가입 시 등록한 정보를 입력해주세요.</p>

<div class="bg-area">
	<p class="bg-txt">
		<c:out value="${result.partnerNm}"/>님의 아이디는<em><c:out value="${result.partnerEmail}"/></em>입니다.<br />
	</p>
	<div class="btn-cont">
		<a href="/member/findPassword.do" class="btn spot btn_chpw">비밀번호찾기</a>
		<a href="/login/login.do" class="btn">로그인</a>
	</div>
</div>
</body>
</html>