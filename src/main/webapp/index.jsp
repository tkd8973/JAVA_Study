<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>파티 게시판</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">파티 게시판</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <form action="list" method="GET" class="form-inline my-2 my-lg-0">
                        <button type="submit" class="btn btn-link">목록 보기</button>
                    </form>
                </li>
                <li class="nav-item">
                    <a href="write.jsp" class="nav-link">글 작성</a>
                </li>
            </ul>
        </div>
    </nav>
    <div class="container my-5">
        <div class="jumbotron">
            <h1 class="display-4">파티 게시판에 오신 것을 환영합니다!</h1>
            <p class="lead">여기에서는 파티 이야기를 자유롭게 나눌 수 있습니다.</p>
            <hr class="my-4">
            <p>새로운 이야기를 공유해주세요!</p>
            <a class="btn btn-primary btn-lg" href="write.jsp" role="button">글 작성하기</a>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
