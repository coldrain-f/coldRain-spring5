<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>example01</p>
	<p> <c:out value="${requestScope.user_id }" /> </p>
	<p> <c:out value="${requestScope.user_password }" /> </p>
</body>
</html>