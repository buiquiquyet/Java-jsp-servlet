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

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css">
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

                <h1 class="col__right--text">DANH SÁCH SINH VIÊN</h1>


                <form action="find" method="post" class="col__right--form">
                    <input type="text" name="name" class="form__input" placeholder="Tìm kiếm">
                     <button class="form__button"><i class="fa fa-glass">Search</i></button>
                </form>
            </div>
            <div class="btn__button">
                <a href="home" class="button__load">LOAD</a>
            </div>
            <table class="table" id="table">

                <thead class="thead-dark">
                    <tr>
                        <th><input type="checkbox" id="checkboxAll1" ></th>
                         <th>Mã sv</th>
                        <th>Họ tên</th>
                        <th>Năm sinh</th>
                        <th>Địa chỉ</th>
                        <th>Phòng</th>
                        <th>Chức năng</th>

                    </tr>
                </thead>
                <tbody class="tbody__style">
                    <c:forEach items="${lists}" var = "o">
                    <tr>
                        <th><input type="checkbox" class="checkbox"></th>
                        <th>${o.id}</th>
                        <th>${o.ten}</th>
                        <th>${o.age}</th>
                        <th>${o.diachi}</th>
                        <th>${o.tenphong}</th>




                        <th><button  class="btn btn-warning button__edit"
                                      data-id ="${o.id}"
                                   data-ten="${o.ten}"
                                   data-age="${o.age}"
                                   data-diachi="${o.diachi}"       
                                   
                                     ><i class="fa fa-pen"></i>  </button>
                            <a onclick="return confirm('Bạn có chắc xóa không!');" id="xoa_sv" href="delete?sid=${o.id}" class="btn btn-danger"><i class="fa fa-trash"></i>  </a>

                        </th>

                    </tr>
                </c:forEach>



                </tbody>
            </table>

            <div class="btn__button">
                <button id="loginForm" class="button__add">Thêm</button>
                <button id="button_xoa" class="button__add">Xóa</button>
                <button id="button_xuatSv"  onclick="exportToExcel()"class="button__add">Xuất dữ liệu</button>
                  
            </div>

        </div>
         
    </div>
    <div class="modal">
        <div class="modal_overlay"></div>
        <c:if test="${not empty successMessage}">
  <div class="alert alert-success">${successMessage}</div>
</c:if>
        <form id="addForm"   action="add" method="post" class="modal_body ">
          <span class="modal_text" style="font-size: 2rem; color: black;background-color: #cfe2f4">Thêm thông tin sinh viên</span>
          <div class="modal_input">
              
          <input type="text" class="input__text" id="formId" name ="id"   placeholder="Mã sinh viên" >
          <input type="text" class="input__text" id="formName" name ="name" placeholder="Họ tên"    >
          <input type="text" class="input__text" id="formAge" name ="age" placeholder="Năm sinh"    >
          <input type="text" class="input__text" id="formDc" name ="diachi" placeholder="Địa chỉ"    >
          </div>
          <div class="modal_btn">

            <button type="button" name ="button" onclick="quit()" class="modal_btn1 ">Quay lại</button>
            <button type="submit" id="button__add"  name ="edit_form" class="modal_btn1">Thêm</button>
          </div>
          </form>
 </div>
    <div class="modal1">
        <div class="modal_overlay"></div>

        <form id="loginForm" action="edit" method="post" class="modal_body ">
          <span class="modal_text" style="font-size: 2rem; background-color:#cfe2f4 ; color:black;">Edit thông tin sinh viên</span>
          <div class="modal_input">
              
              <input type="text" class="input__text" id="ma_edit" readonly="" name ="id_edit" style="background-color: #ededed"   placeholder="Mã sinh viên" >
          <input type="text" class="input__text" id="ten_edit" name ="ten_edit" placeholder="Họ tên"    >
          <input type="text" class="input__text" id="nam_edit" name ="age_edit" placeholder="Năm sinh"    >
          <input type="text" class="input__text" id="dc_edit" name ="dc_edit" placeholder="Địa chỉ"    >
          </div>
          <div class="modal_btn">

            <button type="button" name ="button" onclick="quit()" class="modal_btn1 ">Quay lại</button>
            <button type="submit" name ="edit_form" class="modal_btn1">Edit</button>
          </div>
          </form>
 </div>

   
</body>
<script src="http://localhost:8081/cuoiki1/js/xuatSv.js"></script>
 <script src="http://localhost:8081/cuoiki1/js/add_edit.js"></script>
 <script type="module" src="http://localhost:8081/cuoiki1/js/xoa_home.js"></script>
 <script type="module" src="http://localhost:8081/cuoiki1/js/main_nav.js"></script>
 <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

 

</html>