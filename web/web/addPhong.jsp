<%-- 
    Document   : addjsp
    Created on : Nov 7, 2022, 3:34:43 PM
    Author     : ADMIN
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Thêm sinh viên</title>
	<meta charset="UTF-8">
        <meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8″/>
	<meta name="viewport" content="width=device-width, initial-scale=1">
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
     <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    
	 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
	<div class="limiter">
	
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt>
					<img src="image/img-01.png" alt="IMG">
				</div>
						
					<form action="addPhong"  method="post" enctype="multipart/form-data">
				<form class="login100-form validate-form">
					<span class="login100-form-title">
						Thêm phòng
                                                 <p class ="text-danger"><font color ="red" >${mess}</font> </p>
					</span>
					
					
					<!--<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name="id" placeholder="Id">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-globe" aria-hidden="true"></i>
						</span>
					</div>-->
					
					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input100" type="text"  placeholder="Tên phòng" name="tenphong">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-home" aria-hidden="true"></i>
						</span>
					</div>
					
					
					
					
					<!--<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input100" type="number" name="gia" placeholder="Gía tiền">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-usd"></i>
						</span>
					</div>-->
					
					
					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						
                                                 <select class="input100" type="text" name="trangthai"  >
								<option value = "CON "> CON </option>
                                                                <option value = "HET "> HET </option>

							  </select>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-ban"></i>
						</span>
					</div>
                                    <div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input100" type="number" name="soluong" placeholder="Số lượng">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-ban"></i>
						</span>
					</div>
                                   
                                   

					<div class="container-login100-form-btn">
						<button type="submit" class="login100-form-btn">
							Thêm
						</button>
					</div>

					<div class="text-center p-t-12">
						<span class="txt1">
							
						</span>
						<a class="txt2" href="phong1">
							Back
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
