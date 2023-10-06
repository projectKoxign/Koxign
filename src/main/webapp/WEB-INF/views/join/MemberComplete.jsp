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
   <img src="../resources/assets/img/koxign-logo.png" alt="koxign" height="200"> <span class="logo-txt"></span>
</a>
<h2 class="icon1">가입완료</h2>
<p class="mB40">회원가입을 완료되었습니다. 감사합니다.</p>
<div class="join_finish">
	<p>"회원가입이 완료되었습니다.<em>로그인 후</em> 사용해 주시기 바랍니다."</p>
	<div class="btn_c">
		<a href="/main/login.do" class="btn-lg spot">로그인</a>
		<a href="/main" class="btn-lg">메인으로</a>
	</div>
</div>

</body>
</html>
