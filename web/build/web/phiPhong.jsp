<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quản lí KTX</title>
    <link rel="stylesheet" href="css/main_1.css">
    <link rel="stylesheet" href="css/base.css">
  <link rel="icon" type="image/png" href="titile.jpg">

    <link rel="stylesheet" href="css/reponsive.css">
    <link rel="stylesheet" href="icon/icon/css/all.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/FileSaver.js/2.0.5/FileSaver.min.js"></script>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css">
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

</head>

<body style="margin:0">
   <header class="header" id="header">
        <div class="icon__bar">
            <i class="fa-solid fa-bars"></i>
        </div>
        <div class="header__icon" id="header_icon">

            <i class=" fa fa-user-tie  " id="icon_menu"></i>
        </div>


    </header>
    <div class="overlay_menu">

    </div>
        <div class="header__nav" id="header_nav">
            <ul class="nav__list">
                <a href="admin.jsp" class="nav__item">Login</a>
                <a href="adminDangki.jsp" class="nav__item">Sign in</a>
                <a href="phanquyen.jsp" class="nav__item">Log Out</a>
            </ul>
        </div>
    <div class="grid">
        <div class="col__left">
            <ul class="col__left--list">
               <a href="home" class="col__left--item"><i class="fa fa-house icon"></i>Danh sách sinh viên</a>
                <a href="phong1" class="col__left--item"><i class="fa fa-book icon"></i>Danh sách phòng</a>
                <a href="phongControl" class="col__left--item"><i class="fa-solid fa-calendar-days icon"></i>Nhập phòng</a>
                <a href="phiPhong" class="col__left--item"><i class="fa-solid fa-calendar-days icon"></i>Tiền phòng</a>
                   <a href="nhapFile.jsp" class="col__left--item"><i class="fa-solid fa-calendar-days icon"></i>Nhập File</a>
            </ul>
             <div class="col__left--log">
                <a href="#" class="col__log--a"><i class="fa fa-power-off"></i></a>
                
            </div>
        </div>
        <div class="col__right">
            <div>

                <h1 class="col__right--text"> TIỀN PHÒNG</h1>


<!--                <form action="find" method="post" class="col__right--form">
                    <input type="text" name="name" class="form__input" placeholder="Tìm kiếm">
                     <button class="form__button"><i class="fa fa-glass">Search</i></button>
                </form>
            </div>
            <div class="btn__button">
                <a href="home" class="button__load">LOAD</a>
            </div>-->
            <table class="table" id="table">

                <thead class="thead-dark">
                    <tr>
                        <th><input type="checkbox" id="checkboxAll1" ></th>
                         <th>Tên phòng</th>
                        <th>Số đầu kì</th>
                        <th>Số cuối kì</th>
                        <th>KW sử dụng</th>
                        <th>Đơn giá</th>
                        <th>Tổng tiền</th>

                    </tr>
                </thead>
                
                <tbody class="tbody__style">
                    <c:forEach items="${list}" var = "o">
                    <tr>
                        <th><input type="checkbox" class="checkbox"></th>
                        <th>${o.tenphong}</th>
                        
                        <th><fmt:formatNumber value="${o.sodien}" pattern="#,###"/></th>
                        <th style="padding: 0;width: 15%"><input id="input" type="number" name="sodienmoi" value="0" class="no-spinners" style="width: 100%;height: 40px;text-align: center;border: none;
    outline: none;background-color: #ededed" min = "0"></th>
                        <th id="kw"></th>
                        <th><fmt:formatNumber value="${o.dongia}" pattern="#,###"/></th>
                        <th id="tongtien"><fmt:formatNumber value="${o.tienphong}" pattern="#,###"/></th>






                    </tr>
                </c:forEach>



                </tbody>
            </table>

            <div class="btn__button" style="display: flex;
    justify-content: space-between;">
                <button id="button_xuat" onclick="exportToExcel()" class="button__add">Xuất File</button>
                <button id="button_tinhtien" class="button__add">Tính Tiền</button>
            </div>

        </div>
         
    </div>

   
</body>
 <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

 <script src="http://localhost:8081/cuoiki1/js/tinhtien.js"></script>

<!--<!-- <script src="http://localhost:8081/cuoiki1/js/add_edit.js"></script>
 <script type="module" src="http://localhost:8081/cuoiki1/js/xoa_home.js"></script>
 <script type="module" src="http://localhost:8081/cuoiki1/js/main_nav.js"></script>
 -->

</html>