<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/app.css">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
    <title>Đăng nhập</title>
</head>

<body>

			
		  
    <div id="wrapper">	
        <form action="adminLogin" id="form-login"  method="get">
          
			
            
            <input type="submit" value="Admin" class="form-submit">
           
        </form>
             <form action="login" id="form-login"  method="get">

            <input type="submit" value="Nhân Viên" class="form-submit">
           
        </form>
    </div>
    
</body>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="js/app.js"></script>
</html>