<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import= "org.CRUD.Board" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.persistence.*" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>게시판</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .btn-back {
            background-color: #6c757d;
            border-color: #6c757d;
        }

        .btn-back:hover {
            background-color: #5a6268;
            border-color: #5a6268;
        }

        .btn-create {
            position: fixed;
            right: 50px;
            bottom: 50px;
        }
    </style>
</head>
<body>
    <div class="container mt-3">
        <h1 class="text-center">게시판</h1>
        <button type="button" class="btn btn-secondary mt-3" onclick="location.href='index.jsp'">뒤로가기</button>
        <button type="button" class="btn btn-primary btn-create" onclick="location.href='./write.jsp'">글 작성</button>
        <table class="table table-bordered table-hover mt-3">
            <thead>
                <tr>
                    <th>작성일</th>
                    <th>작성자</th>
                    <th>내용</th>
                    <th>수정/삭제</th>
                </tr>
            </thead>
            <tbody>
                <c:if test="${not empty postList}">
                    <c:forEach items="${postList}" var="post">
                        <tr>
                            <td>${post.dt}</td>
                            <td>${post.WRITER}</td>
                            <td>${post.WRITING}</td>
                            <td>
                            <div class="btn-group" role="group">
                                <button type="button" class="btn btn-sm btn-outline-secondary" onclick="window.location.href='update.jsp?id=${post.ID}'">수정</button>
                                <button type="button" class="btn btn-sm btn-outline-danger" onclick="if(confirm('정말 삭제하시겠습니까?')){window.location.href='./delete.jsp?id=${post.ID}'}">삭제</button>
                            </div>
                            </td>
                        </tr>
                    </c:forEach>
                </c:if>
                <c:if test="${empty postList}">
                    <tr>
                        <td colspan="3" class="text-center">게시물이 없습니다.</td>
                    </tr>
                </c:if>
            </tbody>
        </table>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
