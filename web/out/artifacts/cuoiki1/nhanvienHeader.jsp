<%-- 
    Document   : header
    Created on : Nov 8, 2022, 9:29:09 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html  lang="en">
  <head >
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    <meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8″/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" href="images/favicon.ico" type="image/favicon.ico" />
        <link rel="icon" href="image/favicon.ico" type="image/favicon.ico" />
    <title>Quản lí KTX  </title>

  
    <link href="css/bootstrap.min.css" rel="stylesheet">
   
   
   
    <link href="http://localhost:8081/cuoiki1/css/nprogress.css" rel="stylesheet">
  
    <link href="http://localhost:8081/cuoiki1/css/green.css" rel="stylesheet">
	
    <link href="http://localhost:8081/cuoiki1/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
  
    <link href="http://localhost:8081/cuoiki1/css/jqvmap.min.css" rel="stylesheet"/>

    <link href="http://localhost:8081/cuoiki1/css/daterangepicker.css" rel="stylesheet">
         <link href="http://localhost:8081/cuoiki1/css/menu.css" rel="stylesheet">

  
    <link href="http://localhost:8081/cuoiki1/css/custom.min.css" rel="stylesheet">
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="home" class="site_title"><i class="fa fa-home"></i> <span>Nhân Viên</span></a>
            </div>

            <div class="clearfix"></div>

        
            <div class="profile clearfix">
              <div class="profile_pic">
                <!--<img src="image/img1.jpg" alt="..." class="img-circle profile_img">-->
              </div>
              <div class="profile_info">
                <span></span>
                <h2></h2>
              </div>
            </div>

            <br />

            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
               
                  <li><a href="nhanvienHome"><i class="fa fa-home"></i> Danh sách sinh viên </a>  
                     <li><a href="nhanvienPhong"><i class="fa fa-bars"></i> Danh sách phòng </a>    
                       
                  
  		
                  </li>
                  
                    
                    
                    
                    
                  
                    <!--<div class="sec-center"> 	
	  	<input class="dropdown" type="checkbox" id="dropdown" name="dropdown"/>
                <a href="#"><label class="for-dropdown" for="dropdown">Danh sách phòng <i class="uil uil-arrow-down"></i></label></a>
  		<div class="section-dropdown"> 
                   
  			<a href="phongControl1?cid="> <i class="uil uil-arrow-right"></i></a>
                     
		  	
  		</div>
  	</div>-->
                    <!--<li><a href="phongControl"><i class="fa fa-bars"></i> Chỉ số điện </a>  </li>
                    <li><a href="#"><i class="fa fa-bars"></i> Dịch vụ </a></li>-->
                  
                    <li><a href="nhanvienNhapphong"><i class="fa fa-home"></i> Nhập phòng </a>
                    <!--<ul class="nav child_menu">
                      <li><a href="#">Chỉ số điện</a></li>
                      <li><a href="#">Nước</a></li>
                     
                    </ul>-->
                  </li>
                 
                          
                  
              
                    
                  
                 
                    
               <!-- <input class="dark-light" type="checkbox" id="dark-light" name="dark-light"/>
  	<label for="dark-light"></label>

  	<div class="light-back"></div> 

	<a href="https://front.codes/" class="logo" target="_blank">
		<img src="https://assets.codepen.io/1462889/fcy.png" alt="">
	</a>-->
  
	  	<!--<input class="dropdown" type="checkbox" id="dropdown" name="dropdown"/>
	  	<label class="for-dropdown" for="dropdown"><i class="fa fa-bars"></i>Danh sách phòng <i class="uil uil-arrow-down"></i></label>
  		<div class="section-dropdown"> 
                   
		  	  		</div>-->
                
  	</ul>
               
                
               
  	</div>
            </div>
 
              
         
               
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
                <a data-toggle="tooltip" data-placement="top" title="Logout" href="index1.jsp" >
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
          </div>
        </div>

        <div class="top_nav">
          <div class="nav_menu">
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>
              <nav class="nav navbar-nav">
              <ul class=" navbar-right">
                <li class="nav-item dropdown open" style="padding-left: 15px;">
                  <a href="javascript:;" class="user-profile dropdown-toggle" aria-haspopup="true" id="navbarDropdown" data-toggle="dropdown" aria-expanded="false">
                    <img src="image/img1.jpg" alt="">
                  </a>
                  <div class="dropdown-menu dropdown-usermenu pull-right" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item"  href="javascript:;"> Profile</a>
                      <a class="dropdown-item"  href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Settings</span>
                      </a>
                  <a class="dropdown-item"  href="javascript:;">Help</a>
                    <a class="dropdown-item"  href="index1.jsp" ><i class="fa fa-sign-out pull-right"></i> Login</a>
					 <a class="dropdown-item"  href="dangki.jsp" ><i class="fa fa-sign-out pull-right"></i> Sign Up</a>
                                          <a class="dropdown-item"  href="phanquyen.jsp" ><i class="fa fa-sign-out pull-right"></i>  Phân quyền</a>

                  </div>
                </li>

                <li role="presentation" class="nav-item dropdown open">
                  <a href="javascript:;" class="dropdown-toggle info-number" id="navbarDropdown1" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                  <ul class="dropdown-menu list-unstyled msg_list" role="menu" aria-labelledby="navbarDropdown1">
                    <li class="nav-item">
                      <a class="dropdown-item">
                        <span class="image"><img src="image/img1.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>Bùi Qúi Quyết</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li class="nav-item">
                      <a class="dropdown-item">
                        <span class="image"><img src="image/img1.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>Bùi Qúi Quyết</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li class="nav-item">
                      <a class="dropdown-item">
                        <span class="image"><img src="image/img1.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>Bùi Qúi Quyết</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li class="nav-item">
                      <a class="dropdown-item">
                        <span class="image"><img src="image/img1.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>Bùi Qúi Quyết</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li class="nav-item">
                      <div class="text-center">
                        <a class="dropdown-item">
                          <strong>See All Alerts</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                      </div>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>


