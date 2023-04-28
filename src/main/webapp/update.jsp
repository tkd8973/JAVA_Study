<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import= "org.CRUD.Board" %>
<%@ page import="javax.persistence.*" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
	<title>게시판 - 수정</title>
	<!-- Bootstrap CDN -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-3">
		<h1>게시물 수정</h1>
		<form action="update" method="post">
			<div class="form-group">
				<label for="writer">작성자</label>
				<input type="text" class="form-control" id="writer" name="writer" value="${param.writer}">
			</div>
			<div class="form-group">
				<label for="writing">내용</label>
				<textarea class="form-control" id="writing" name="writing" rows="5">${param.writing}</textarea>
			</div>
			<input type="hidden" name="id" value="${param.id}">
			<button type="submit" class="btn btn-primary">수정하기</button>
		</form>
		<button type="button" class="btn btn-secondary mt-3" onclick="history.back()">취소</button>
	</div>
	<!-- Bootstrap CDN -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>