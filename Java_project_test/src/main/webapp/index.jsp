<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
     <meta charset="UTF-8">
        <title>게시판</title>
        <style>
            body {
                background-image: url("https://i.gifer.com/64mE.gif");
            }

            .glow {
                text-shadow: 0 0 10px #FF0000, 0 0 20px #FF7700, 0 0 30px #FFFF00, 0 0 40px #00FF00, 0 0 50px #00FFFF, 0 0 60px #0000FF, 0 0 70px #8B00FF;
            }

            .combined-btn {
                background-color: #28a745;
                border-color: #28a745;
                text-shadow: 0 0 10px #FF0000, 0 0 20px #FF7700, 0 0 30px #FFFF00, 0 0 40px #00FF00, 0 0 50px #00FFFF, 0 0 60px #0000FF, 0 0 70px #8B00FF;
                font-weight: bold;
                font-size: 50px;
                padding: 20px 50px;
            }

            .combined-btn:hover {
                background-color: #218838;
                border-color: #1e7e34;
            }
        </style>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <form action="list" method="GET">
            <div class="text-center mt-5">
                <button type="submit" class="combined-btn">
                  <span class="glow">⚡번개 모임⚡</span>
                </button>
            </div>
        </form>
    </div>
    <!-- Bootstrap JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
