<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<html>
<head> <!-- head - 눈에 보이진 않지만 중요한 데이터를 가진 태그들 -->
    <meta charset="UTF-8"> <!-- 웹페이지 인코딩 -->
    <title>Hello, JSP!</title> <!-- 웹페이지 제목 -->
</head>
<body>
<h2>Hello, JSP!</h2>
<p>The time on the server is <%= new java.util.Date() %></p>
</body>
</html>