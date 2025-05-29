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

                <h1 class="col__right--text"> NHẬP DỮ LIỆU</h1>


               
            </div>
           
            <div style="display:flex;flex-direction: column;">
                <span style="font-size: 1.6rem;
    margin-bottom: 10px;">Các trường dữ liệu cần nhập trong file CSV</span>
                <img src="ss.jpg">
            </div>

            <div class="btn__button">
              
                  <input type="file" id="fileInput" style="display: none;">
                    <label for="fileInput" class="button__add">Chọn File</label>
            </div>

        </div>
         
    </div>
  

   
</body>

 <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>


 <script>
 function sendCSVDataToServlet(csvData) {
  const xhr = new XMLHttpRequest();
  const url = "nhapFileSv"; // Thay thế bằng URL của Servlet của bạn

  xhr.open("POST", url, true);

  xhr.setRequestHeader("Content-Type", "application/json");
  xhr.onreadystatechange = function () {
    if (xhr.readyState === 4 && xhr.status === 200) {
     const response = JSON.parse(xhr.responseText);
      const status = response.status;
      const message = response.message;
       const count = response.count;
      console.log("Server response:", status, message);

      if (status === "success") {
        // Hiển thị hộp thoại thông báo thành công
        Swal.fire({
          title: "Thông báo",
          text: `Dữ liệu được import`,
          icon: "success",
          confirmButtonText: "Đóng",
          
        });
        
      } else {
        // Hiển thị hộp thoại thông báo lỗi
        Swal.fire({
          title: "Lỗi",
          text: message,
          icon: "error",
          confirmButtonText: "Đóng",
        });
      }
    }
  };


  const jsonData = JSON.stringify(csvData);

  xhr.send(jsonData);
}

// Code xử lý khi nhận được dữ liệu từ file CSV
const fileInput = document.getElementById("fileInput"); // Thay thế bằng ID của input file
fileInput.addEventListener("change", function (event) {
  const file = event.target.files[0];

  readCSVFile(file)
    .then((csvData) => {
      const rows = csvData.split("\n"); // Phân tách các dòng
      const data = [];

      for (let i = 1; i < rows.length; i++) {
        const columns = rows[i].split(","); // Phân tách các cột
        data.push(columns);
      }

      console.log(data); // In ra dữ liệu CSV trong mảng 2 chiều

      sendCSVDataToServlet(data); // Gửi dữ liệu tới Servlet
    })
    .catch((error) => {
      console.error("Error reading CSV file:", error);
    });
});

// Function đọc file CSV
function readCSVFile(file) {
  return new Promise((resolve, reject) => {
    const reader = new FileReader();

    reader.onload = (event) => {
      const csvData = event.target.result;
      resolve(csvData.trim());
    };

    reader.onerror = (event) => {
      reject(event.target.error);
    };

    reader.readAsText(file, "ISO-8859-1"); // Đọc file với mã hóa ISO-8859-1 (latin1)
  });
}
 </script>

</html>