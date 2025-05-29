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
          document.getElementById("tenp_add").value ="";
       document.getElementById("tt_add").text =  document.getElementById("tt_add").options[0].text  ;
       document.getElementById("tt_add").value = ""  ;
         document.getElementById("sl_add").value ="";
      

      });
    const table = document.querySelectorAll('.button__edit');
       table.forEach(button =>{
      button.addEventListener('click',e=> {
       
         document.getElementById("tenp_edit").value = button.dataset.tenphong;
         document.getElementById("tt_edit").options[0].value = button.dataset.trangthai;
          document.getElementById("tt_edit").options[0].text = button.dataset.trangthai;
           document.getElementById("sl_edit").value = button.dataset.soluong;
       
       
        e.preventDefault();
        overlayEdit.style.display = 'flex';

      });
     });

   function quit(){
      overlay.style.display = "none";
      overlayEdit.style.display ="none";
   }
   
     var form = document.querySelector('#addForm_phong');
    form.addEventListener('submit', function(e) {
    e.preventDefault();
    var data = new FormData(form);
    sendData(data);

});
function sendData(data) {
    var newRow = document.createElement("tr");
    
   
    var nameCell = document.createElement("th");
    var ttCell = document.createElement("th");
    var slCell = document.createElement("th");
    var check = document.createElement("th");
    
    var chucnang = document.createElement("th");
   

    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4 && xhr.status == 200) {
            var responses = xhr.responseText;
           if(responses == "error"){
                 Swal.fire({
          title: "Cảnh báo",
          text: "Vui lòng nhập đầy đủ thông tin",
          icon: "warning",
          confirmButtonText: "Đóng",
        });
           }
           else if(responses == "error1"){
               
                Swal.fire({
          title: "Cảnh báo",
          text: "Tên phòng đã tồn tại.",
          icon: "warning",
          confirmButtonText: "Đóng",
        });
           }
           else{
                 Swal.fire({
          title: "Thông báo",
          text: "Thêm phòng thành công.",
          icon: "success",
          confirmButtonText: "Đóng",
        });
               
       
               overlay.style.display = "none";
               
               
               nameCell.innerHTML   = document.getElementById("tenp_add").value;
               ttCell.innerHTML   = document.getElementById("tt_add").value;
               slCell.innerHTML   = document.getElementById("sl_add").value;
               
               var checkbox = document.createElement("input");
                checkbox.type = "checkbox";
                

        // Thêm button "Sửa" và link "Xóa" cho dòng mới
                var editLink = document.createElement("button");
                editLink.className = "btn btn-warning button__edit";
                
                editLink.dataset.tenphong = document.getElementById("tenp_add").value;
                editLink.dataset.trangthai = document.getElementById("tt_add").value;
                editLink.dataset.soluong = document.getElementById("sl_add").value;
                editLink.innerHTML = '<i class="fa fa-pen"></i>';

                var deleteLink = document.createElement("a");
                deleteLink.className = "btn btn-danger";
                deleteLink.href = "xoaPhong?sid=" + document.getElementById("tenp_add").value;
                deleteLink.setAttribute("onclick", "return confirm('Bạn có chắc xóa không!');");
                deleteLink.innerHTML = '<i class="fa fa-trash"></i>';
                
                check.appendChild(checkbox);
                chucnang.appendChild(editLink);
                chucnang.appendChild(deleteLink);
                
                 newRow.appendChild(check);
                newRow.appendChild(nameCell);
                newRow.appendChild(ttCell);
                 newRow.appendChild(slCell);
                
                 newRow.appendChild(chucnang);
                 var tableBody = document.getElementById("table").getElementsByTagName("tbody")[0];
                tableBody.appendChild(newRow);
                const table = document.querySelectorAll('.button__edit');
                table.forEach(button =>{
                    
                 button.addEventListener('click',e=> {
       
                document.getElementById("tenp_edit").value = button.dataset.tenphong;
               
                document.getElementById("tt_edit").value = button.dataset.trangthai;
                document.getElementById("sl_edit").value = button.dataset.soluong;
                 e.preventDefault();
                 overlayEdit.style.display = 'flex';
                 

      });
     });
               
                 
           }
        }
    };
    xhr.open('POST', 'addPhong', true);
    xhr.send(data);
}
