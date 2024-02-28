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
	<div class="limiter">
	
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt>
					<img src="image/img-01.png" alt="IMG">
				</div>
						
					<form action="edit"  method ="post" enctype="multipart/form-data">
				<form class="login100-form validate-form">
					<span class="login100-form-title">
						Edit Sinh Viên
					</span>
					
					 <label>ID:</label>
					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
                                            <input class="input100" type="text" name="id"  value="${st.id}" placeholder="TÊN SINH VIÊN" readonly>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-globe" aria-hidden="true"></i>
						</span>
					</div>
					<label>NAME:</label>
					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
                                            <input class="input100" type="text" name="name"  value="${st.ten}" placeholder="ID">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							 <i class="fa fa-signature"  aria-hidden="true"></i>
						</span>
					</div>
					
                                               
					
					<label>AGE:</label>
					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input100" type="number" name="age"  value="${st.age}" placeholder="AGE">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
                                                                    <i class="fa fa-file-signature"></i>

						</span>
					</div>
					
					<label>ĐỊA CHỈ:</label>
					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name="diachi"  value="${st.diachi}" placeholder="ĐỊA CHỈ">
                                                <span class="focus-input100">
                                                    <option value= "101" >101</option>
								
                                                </span>
						<span class="symbol-input100">
							<i class="fa fa-home"></i>
						</span>
					</div>
                                                
                                            
					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Edit
						</button>
					</div>

					<div class="text-center p-t-12">
						<span class="txt1">
							
						</span>
						<a class="txt2" href="home">
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
