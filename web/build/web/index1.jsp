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
        <form action="login" id="form-login"  method="post">
            <h1 class="form-heading">Nhân Viên</h1>
            <!--<div class="alert alert-danger" role="alert">-->
                <p class ="text-danger"><font color ="red" >${mess}</font> </p>
            <!--</div>-->
            <div class="form-group">
                <i class="far fa-user"></i>
                <input type="text" class="form-input" placeholder="Tên đăng nhập" name="user" value="" ><!--  autocomplete="off" autofocus/>-->
            </div>
			
            <div class="form-group">
                <i class="fas fa-key"></i>
                <input type="password" class="form-input" placeholder="Mật khẩu" name="pass" value=""  ><!--  autocomplete="off" autofocus/>-->
                <div id="eye">
                    <i class="far fa-eye"></i>
                </div>
            </div>
			
            
            <input type="submit" value="Đăng nhập" class="form-submit">
            <a class="dropdown-item"  href="dangki.jsp" ><i class="fa fa-sign-out pull-right"></i> Sign Up</a>
              &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; <a class="dropdown-item"  href="phanquyen.jsp" ><i class="fa fa-sign-out pull-right"></i> Back</a>
        </form>
    </div>
    
</body>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="js/app.js"></script>
</html>