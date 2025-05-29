/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */


   
    const overlay = document.querySelector(".modal");
    const overlayEdit = document.querySelector(".modal1");
//    forms.forEach(form => {
    
      const loginBtns = document.querySelector('.button__add');

      loginBtns.addEventListener('click',e=> {

        e.preventDefault();
        overlay.style.display = 'flex';
          document.getElementById("formId").value ="";
       document.getElementById("formName").value ="";
         document.getElementById("formAge").value ="";
       document.getElementById("formDc").value ="";

      });
    const table = document.querySelectorAll('.button__edit');
       table.forEach(button =>{
      button.addEventListener('click',e=> {
       
       document.getElementById("ma_edit").value = button.dataset.id;
       document.getElementById("ten_edit").value = button.dataset.ten;
       document.getElementById("nam_edit").value = button.dataset.age;
       document.getElementById("dc_edit").value = button.dataset.diachi;
       

       
       
        e.preventDefault();
        overlayEdit.style.display = 'flex';

      });
     });

   function quit(){
      overlay.style.display = "none";
      overlayEdit.style.display ="none";
   }
   
     var form = document.querySelector('#addForm');
    form.addEventListener('submit', function(e) {
    e.preventDefault();
    var data = new FormData(form);
    sendData(data);

});
function sendData(data) {
    var newRow = document.createElement("tr");
    
    var idCell = document.createElement("th");
    var nameCell = document.createElement("th");
    var ageCell = document.createElement("th");
    var diachiCell = document.createElement("th");
    var check = document.createElement("th");
    var phong = document.createElement("th");
    var chucnang = document.createElement("th");
   

    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4 && xhr.status == 200) {
            var response = xhr.responseText;
           if(response == "error"){
                 Swal.fire({
          title: "Lỗi",
          text: "Vui lòng nhập đầy đủ thông tin",
          icon: "error",
          confirmButtonText: "Đóng",
        });
           }
           else if(response == "error1"){
//                alert("Mã sinh viên đã tồn tại.");
                 Swal.fire({
                title: "Cảnh báo",
                text: "Mã sinh viên đã tồn tại",
                icon: "warning",
                confirmButtonText: "Đóng",
        });
           }
           else{
//               alert("Thêm sinh viên thành công.");
                    Swal.fire({
               title: "Thông báo",
               text: `Thêm sinh viên thành công`,
               icon: "success",
               confirmButtonText: "Đóng",

             });
       
               overlay.style.display = "none";
               
               idCell.innerHTML   = document.getElementById("formId").value;
               nameCell.innerHTML   = document.getElementById("formName").value;
               ageCell.innerHTML   = document.getElementById("formAge").value;
               diachiCell.innerHTML   = document.getElementById("formDc").value;
               
               var checkbox = document.createElement("input");
                checkbox.type = "checkbox";
                

        // Thêm button "Sửa" và link "Xóa" cho dòng mới
                var editLink = document.createElement("button");
                editLink.className = "btn btn-warning button__edit";
                editLink.dataset.id = document.getElementById("formId").value;
                editLink.dataset.ten = document.getElementById("formName").value;
                editLink.dataset.age = document.getElementById("formAge").value;
                editLink.dataset.diachi = document.getElementById("formDc").value;
                editLink.innerHTML = '<i class="fa fa-pen"></i>';

                var deleteLink = document.createElement("a");
                deleteLink.className = "btn btn-danger";
                deleteLink.href = "delete?sid=" + document.getElementById("formId").value;
                deleteLink.setAttribute("onclick", "return confirm('Bạn có chắc xóa không!');");
                deleteLink.innerHTML = '<i class="fa fa-trash"></i>';
                
                check.appendChild(checkbox);
                chucnang.appendChild(editLink);
                chucnang.appendChild(deleteLink);
                
                 newRow.appendChild(check);
                newRow.appendChild(idCell);
                newRow.appendChild(nameCell);
                newRow.appendChild(ageCell);
                 newRow.appendChild(diachiCell);
                 newRow.appendChild(phong);
                 newRow.appendChild(chucnang);
                 var tableBody = document.getElementById("table").getElementsByTagName("tbody")[0];
                tableBody.appendChild(newRow);
                const table = document.querySelectorAll('.button__edit');
                table.forEach(button =>{
                    
                 button.addEventListener('click',e=> {
       
                document.getElementById("ma_edit").value = button.dataset.id;
                document.getElementById("ten_edit").value = button.dataset.ten;
                document.getElementById("nam_edit").value = button.dataset.age;
                document.getElementById("dc_edit").value = button.dataset.diachi;
                 e.preventDefault();
                 overlayEdit.style.display = 'flex';
                 

      });
     });
               
                 
           }
        }
    };
    xhr.open('POST', 'add', true);
    xhr.send(data);
}
   
     
