<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시글 작성</title>
	<!-- Bootstrap CDN -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<form method="post" action="Create" class="border p-3 rounded">
					<h3 class="text-center mb-4">게시글 작성</h3>
					<div class="form-group">
						<label for="writer">작성자</label>
						<input type="text" name="WRITER" class="form-control" id="writer" placeholder="작성자를 입력하세요">
					</div>
					<div class="form-group">
						<label for="writing">내용</label>
						<textarea name="WRITING" class="form-control" id="writing" placeholder="내용을 입력하세요" rows="5"></textarea>
					</div>
					<div class="form-group text-center">
						<button type="submit" class="btn btn-primary">완료</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- Bootstrap CDN -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>