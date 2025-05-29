<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/main_1.css">
    <link rel="stylesheet" href="css/base.css">

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
                <a href="index1.jsp" class="nav__item">Login</a>
                <a href="dangki.jsp" class="nav__item">Sign in</a>
                <a href="phanquyen.jsp" class="nav__item">Log Out</a>
            </ul>
        </div>
    <div class="grid">
        <div class="col__left">
            <ul class="col__left--list">
                 <a href="nhanvienHome" class="col__left--item"><i class="fa fa-house icon"></i>Danh sách sinh viên</a>
                <a href="nhanvienPhong" class="col__left--item"><i class="fa fa-book icon"></i>Danh sách phòng</a>
                <a href="nhanvienNhapphong" class="col__left--item"><i class="fa-solid fa-calendar-days icon"></i>Nhập phòng</a>
            </ul>
            <div class="col__left--log">
                <a href="#" class="col__log--a"><i class="fa fa-power-off"></i></a>
                
            </div>
        </div>
        <div class="col__right">
            <div>

                <h1 class="col__right--text">DANH SÁCH NHẬP PHÒNG</h1>


                <form action="nhanvienTimfull" method="post" class="col__right--form">
                    <input type="text" name="trangthai" class="form__input" placeholder="Tìm kiếm">
                    <button class="form__button "><i class="fa fa-glass">Search</i></button>
                </form>
            </div>
            <div class="btn__button">
                <a href="nhanvienNhapphong" class="button__load">LOAD</a>
            </div>
            <%
                int i = 1;
              
                if (session.getAttribute("i") != null) {
                    i = (Integer)session.getAttribute("i");
                }
               
                %>
            <div class="grid__row">
                  <c:forEach items="${lis}"  var = "o">
                      <%
                           String img = Integer.toString(i) ;
                          %>
                <div class="grid__column-2-4">
                    <img src="<%= img %>.jpg " alt="" class="grid__img">
                    <h1 >

                        Phòng ${o.tenphong}

                    </h1>
                    <p class="grid__p">Số lượng: ${o.soluong}</p>
                    <p class="grid__p grid__margin">Trạng thái: ${o.trangthai}</p>
                    <div class="grid__form--btn">

                             <button id="button_see" data-id="${o.tenphong}"  class="button__add btn__margin">Xem sv</button>

                        <!--<button id="button_phiphong" data-id="${o.tenphong}" class="button__add btn__margin1">Phí phòng</button>-->
                    </div>

                </div>
                   
               <%
                i++;
                //session.setAttribute("i", i);
                %>
                 </c:forEach>

            </div>
                     
            <h1 class="col__right--text">DANH SÁCH SINH VIÊN CHƯA NHẬP PHÒNG</h1>
            <table class="table" id="table">

                <thead class="thead-dark">
                    <tr>
                        <!--<th><input type="checkbox" id="checkboxAll1" ></th>-->
                        <th>Mã sv</th>
                        <th>Họ tên</th>
                        <th>Năm sinh</th>
                        <th>Địa chỉ</th>
                       


                    </tr>
                </thead>
                <tbody class="tbody__style">
                    <c:forEach items="${lists}" var = "o">
                    <tr>
                        <!--<th><input type="checkbox" class="checkbox"></th>-->
                        <th data-ma="${o.id}">${o.id}</th>
                        <th>${o.ten}</th>
                        <th>${o.age}</th>
                        <th>${o.diachi}</th>
                        

                    </tr>
                </c:forEach>



                </tbody>
            </table>

<!--            <div class="btn__button">
                <button id="button_them" class="button__add">Thêm</button>
            </div>-->

        </div>

    </div>
    <div class="modal" >
        <div class="modal_overlay"></div>
        
        <form id="addForm_phong"  method="post" class="modal_body " >
          <span class="modal_text" id="phong_text" style="font-size: 2rem; color: black;background-color: #cfe2f4"> </span>
       
          <div class="modal_input">
            <table class="table" id="my_Table">

                <thead class="thead-dark">
                    <tr>
                        <!--<th></th>-->
                        <th >Mã sv</th>
                        <th>Họ tên</th>
                        <th>Năm sinh</th>
                        <th>Địa chỉ</th>
                        <th>Phòng</th>


                    </tr>
                </thead>
                <tbody class="tbody__style">
                   
                </tbody>
               
            </table>
<!--               <select  class="input__text1" id="chuyen_phong" name="" >
                   <option value = "">--Chọn phòng để chuyển-- </option>
                   <c:forEach items="${lis}"  var = "o">
                        <option value = ${o.tenphong}> ${o.tenphong} </option>
                   </c:forEach>
            
                </select>-->
             </div>
             
          <div class="modal_btn">

              <button type="button" id="button_exit" name ="button"  class="modal_btn1 " >Quay lại</button>
              
            <!--<button type="button" id="button_chuyen_phong"  name ="edit_form" class="modal_btn1" >Chuyển</button>-->
             <!--<button type="button"  id="button_xoa" name ="" class="modal_btn1" >Xóa</button>-->
             
          </div>
          </form>
 </div>
<!--    <div class="modal1" >
        <div class="modal_overlay"></div>
        
        <form id="addForm_phong"  method="post" class="modal_body " >
          <span class="modal_text" id="phong_text" style="font-size: 2rem; color: black;background-color: #cfe2f4"> Chọn phòng</span>
         
          <div class="modal_input">
               <select class="input__text" id="lop_add" name="lop_add" >
                   <c:forEach items="${lis}"  var = "o">
                   
                        <option value = ${o.tenphong}> ${o.tenphong} </option>
                   </c:forEach>
            
          </select>
             </div>
          <div class="modal_btn">

              <button type="button" id="button_exit_add" name ="button"  class="modal_btn1 " >Quay lại</button>
            <button type="submit" id="button_chuyen" name ="button_chuyen" class="modal_btn1" >Chuyển</button>
            
          </div>
          </form>
 </div>-->
<!--      <div class="modal2" >
        <div class="modal_overlay"></div>
        
        <form id="addForm_phong"  method="post" class="modal_body " >
          <span class="modal_text" id="text_phiphong" style="font-size: 2rem; color: black;background-color: #cfe2f4"> </span>
         
          <div class="modal_input">
               <table class="table" id="">

                <thead class="thead-dark">
                    <tr>
                        <th></th>
                        <th >Mã sv</th>
                        <th>Họ tên</th>
                        <th>Năm sinh</th>
                        <th>Địa chỉ</th>
                        <th>Phòng</th>


                    </tr>
                </thead>
                <tbody class="tbody__style">
                   
                </tbody>
               
            </table>
             </div>
          <div class="modal_btn">

              <button type="button" id="button_exit_add" name ="button"  class="modal_btn1 " >Quay lại</button>
            <button type="submit" id="button_tinh" name ="button_chuyen" class="modal_btn1" >Tính</button>
            
          </div>
          </form>
 </div>-->
</body>
<!--<script type="module" src="http://localhost:8081/cuoiki1/js/trangchu1.js"></script>-->
 <script type="module" src="http://localhost:8081/cuoiki1/js/main_nav.js"></script>
<script>
    const button_see = document.querySelectorAll(".btn__margin");
   const overlay = document.querySelector(".modal");
   const button_exit = document.getElementById("button_exit");
   button_exit.addEventListener('click', function() {
 
        var tableBody = document.getElementById("my_Table").getElementsByTagName("tbody")[0];
            tableBody.innerHTML ="";
            overlay.style.display = "none";

      
    });
    button_see.forEach(button =>{
        button.addEventListener('click', e=> {
    
        e.preventDefault();
       
        const id = button.dataset.id;
        const xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4 && xhr.status === 200) {
                const data = JSON.parse(xhr.responseText);
                document.getElementById("phong_text").innerText  = 'Danh sách sinh viên phòng '+ data.map.data1.tenphong;
                phong = data.map.data1.tenphong;
                data.map.data2.myArrayList.forEach(item => {

                        var tableBody = document.getElementById("my_Table").getElementsByTagName("tbody")[0];
   
//                          const checkbox = '<input type="checkbox" id="checkboxs" class="checkbox">';

                          var tr = '<tr>' +
//                                    '<th>' + checkbox + '</th>' +
                                    '<th>' + item.map.id + '</th>' +
                                    '<th>' + item.map.ten + '</th>' +
                                    '<th>' + item.map.age + '</th>' +
                                    '<th>' + item.map.diachi + '</th>' +
                                    '<th>' + item.map.tenphong + '</th>' +
                                  '</tr>';
                          tableBody.innerHTML += tr;
     
                });
                overlay.style.display = 'flex';
 
            } else {
            }
        };
         xhr.open('GET', 'nhanvienDssvPhong?id=' + id, true);
        xhr.send();
        
        
    });
    });
    </script>




</html>