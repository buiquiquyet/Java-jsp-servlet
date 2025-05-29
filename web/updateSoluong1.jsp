<%-- 
    Document   : addjsp
    Created on : Nov 7, 2022, 3:34:43 PM
    Author     : ADMIN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Edit sinh viên</title>
	<meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="css/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="css/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
	
	<link rel="icon" href="image/favicon.ico" type="image/favicon.ico" />
</head>
<body>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
         <style>
             div.wrap-login100{
                 text-align: center;
             }
         </style>
         <div class="limiter">
	
		<div class="container-login100">
			<div class="wrap-login100">
				
						
					<form action="updateSoluong"  method ="post" enctype="multipart/form-data">
				<form class="login100-form validate-form">
					<span class="login100-form-title">
						Cap nhat so luong sv
					</span>
					
					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
                                            <input class="input100" type="text" name="tenphong" value ="${sl.tenphong}"   placeholder="--ID--" readonly>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-globe" aria-hidden="true"></i>
						</span>
					</div>
					
					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
                                            <input class="input100" type="number" name="soluong"  value ="${sl1.soluong}"   placeholder="--So luong con lai--" >
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-globe" aria-hidden="true"></i>
						</span>
					</div>
					
                                            
					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Cập nhật
						</button>
					</div>

					<div class="text-center p-t-12">
						<span class="txt1">
							Forgot
						</span>
						<a class="txt2" href="#">
							Username / Password?
						</a>
					</div>

					<div class="text-center p-t-136">
						<a class="txt2" href="#">
							Create your Account
							<i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
						</a>
					</div>
					
				</form>
			</div>
		</div>
	</div>
	
	

	
<!--===============================================================================================-->	
	<script src="js/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="js/popper.js"></script>
	<script src="js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="js/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="js/tilt.jquery.min.js"></script>
	<script >
		$('.js-tilt').tilt({
			scale: 1.1
		})
	</script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>
