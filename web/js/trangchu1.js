/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */
   
    const button_see = document.querySelectorAll(".btn__margin");
    const overlay = document.querySelector(".modal");
    const overlay_add = document.querySelector('.modal1');
    const overlay_tinhtien = document.querySelector('.modal2');
    const table = document.getElementById("table");
    const button_exit = document.getElementById("button_exit");
    const tbody = document.querySelector('.tbody__style');
    const button_them = document.getElementById("button_them");
    const button_chuyen = document.getElementById("button_chuyen");
    const button_load = document.getElementById("button_load");
//    const button_phiphong = document.getElementById("button_phiphong");
    const button_phiphong = document.querySelectorAll(".btn__margin1");

   
    import {selectedRows,rowData1,checkAll,checkboxes} from   './main1.js';

    button_them.addEventListener('click', function(event){
        event.preventDefault();
       
        console.log(selectedRows);
        if (selectedRows.length === 0) {
            alert("Vui lòng chọn ít nhất một sinh viên.");
            return;
        }else{
            overlay_add.style.display="flex";
        }

    });
    
    button_chuyen.addEventListener('click', function(event){
        event.preventDefault();
        console.log(rowData1);
       
        const mySelect = document.getElementById("lop_add");
        const selectedValue = mySelect.value;
        for (let i = 0; i < selectedRows.length; i++) {
            selectedRows[i].column2 = selectedValue;
            console.log(selectedRows[i].column1  );
            console.log(selectedRows[i].column2  );
        }

        console.log("ok" + selectedRows);
        var displayedMessage = false;
        const xhr3 = new XMLHttpRequest();
        xhr3.open("POST", "themsvPhong");
        xhr3.setRequestHeader("Content-Type", "application/json");
        xhr3.onreadystatechange = function() {
           
        if (this.readyState === XMLHttpRequest.DONE && this.status === 200) {
            let responses = JSON.parse(this.responseText);
            if( responses.key1 === "success"){         
                 alert("Thêm vào phòng thành công.")
                console.log("thành công");
                displayedMessage = true;
                overlay_add.style.display="none";
                location.reload(); 
            }
            else if (responses.key2 === "error"){
                  Swal.fire({
          title: "Cảnh báo",
          text: "Phòng đã đầy",
          icon: "warning",
          confirmButtonText: "Đóng",
        });
                console.log("error");
                displayedMessage = true; 
            }
            else{
                 Swal.fire({
          title: "Cảnh báo",
          text: "Bạn đã chọn quá số người vào phòng",
          icon: "warning",
      });
          confirmButtonText: "Đóng",
                console.log("warn");
                displayedMessage = true; 
            }
        }
       
        
        };
        
        const jsonData = JSON.stringify(selectedRows);
        
        xhr3.send(jsonData);
   
     });
     
    button_exit.addEventListener('click', function() {
 
        var tableBody = document.getElementById("my_Table").getElementsByTagName("tbody")[0];
            tableBody.innerHTML ="";
            overlay.style.display = "none";

      
    });
   var phong;
   
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
   
                          const checkbox = '<input type="checkbox" id="checkboxs" class="checkbox">';

                          var tr = '<tr>' +
                                    '<th>' + checkbox + '</th>' +
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
         xhr.open('GET', 'dsSvPhong?id=' + id, true);
        xhr.send();
        
        
    });
    });
     button_phiphong.forEach(button =>{
        button.addEventListener('click', e=> {
    
        e.preventDefault();
        overlay_tinhtien.style.display = 'flex';
//       
//        const ids = button.dataset.id;
//        console.log("ok" + ids);
//        document.getElementById("text_phiphong").innerText  = 'Tiền phòng '+ ids;
//        const xhr6 = new XMLHttpRequest();
//        xhr6.onreadystatechange = function() {
//            if (xhr6.readyState === 4 && xhr6.status === 200) {
//                const data = JSON.parse(xhr6.responseText);
//                
//                phong = data.map.data1.tenphong;
//                data.map.data2.myArrayList.forEach(item => {
//
//                        var tableBody = document.getElementById("my_Table").getElementsByTagName("tbody")[0];
//   
//                          const checkbox = '<input type="checkbox" id="checkboxs" class="checkbox">';
//
//                          var tr = '<tr>' +
//                                    '<th>' + checkbox + '</th>' +
//                                    '<th>' + item.map.id + '</th>' +
//                                    '<th>' + item.map.ten + '</th>' +
//                                    '<th>' + item.map.age + '</th>' +
//                                    '<th>' + item.map.diachi + '</th>' +
//                                    '<th>' + item.map.tenphong + '</th>' +
//                                  '</tr>';
//                          tableBody.innerHTML += tr;
//     
//                });
//                overlay.style.display = 'flex';
// 
//            } else {
//            }
//        };
//         xhr6.open('GET', 'dsSvPhong?id=' + ids, true);
//        xhr6.send();
        
        
    });
    });
    const button_exit_add = document.getElementById("button_exit_add");
    button_exit_add.addEventListener('click', e =>{
        e.preventDefault();
        overlay_add.style.display = "none";
    });
    function quit(){
         overlay_add.style.display = "none";
          
         
    }
    const button_xoa = document.getElementById("button_xoa");
    const checkboxe = document.querySelectorAll('#my_Table #checkboxs');
    const tableBody1 = document.getElementById("my_Table").getElementsByTagName("tbody")[0];
    
    const selectedRow = [];

    tableBody1.addEventListener('click', function(event) {
      if (event.target.type === 'checkbox') {
        const checkbox = event.target;
        const row = checkbox.parentNode.parentNode;
        const rowData = {
          column1: row.cells[1].textContent,
        };
        if (checkbox.checked) {
          selectedRow.push(rowData);
        } else {
          const index = selectedRow.findIndex(item => item.column1 === rowData.column1);
          if (index !== -1) {
            selectedRow.splice(index, 1);
          }
        }
      }
    });

    button_xoa.addEventListener('click', function(event){
        event.preventDefault();
        if (selectedRow.length === 0) {
           alert("Vui lòng chọn ít nhất 1 sinh viên.");
           return;
        }
        var displayedMessage1 = false;
        const xhr4 = new XMLHttpRequest();
        xhr4.open("POST", "xoaSvPhong");
        xhr4.setRequestHeader("Content-Type", "application/json");
        xhr4.onreadystatechange = function() {

        if (this.readyState === XMLHttpRequest.DONE && this.status === 200) {
            var responses = xhr4.responseText;
            console.log("Data sent successfully");  
            alert("Xóa sinh viên khỏi phòng thành công");
               
  
                 displayedMessage1 = true;     
        }
      
        location.reload(); 
        
        };
        const jsonData = JSON.stringify(selectedRow);
        xhr4.send(jsonData);
        console.log(selectedRow);
        
        
        
    });
    var count = 0;
    var selectedValue1;
    const button_chuyen_phong = document.getElementById("button_chuyen_phong");
    const sel_chuyen_phong = document.getElementById("chuyen_phong");
    button_chuyen_phong.addEventListener('click', function(e){
        e.preventDefault();
        count++;
        if(count == 1){
            if (selectedRow.length === 0) {
               alert("Vui lòng chọn ít nhất 1 sinh viên.");
               return;
            }else{
                sel_chuyen_phong.style.display = 'block';
            }
        }else if (count >=2){
            if (selectedRow.length === 0) {
               alert("Vui lòng chọn ít nhất 1 sinh viên.");
               return;
            }else{
                sel_chuyen_phong.style.display = 'block';
                selectedValue1 = sel_chuyen_phong.value;
                console.log("ok" + selectedRow);
                for (let i = 0; i < selectedRow.length; i++) {
                    selectedRow[i].column2 = selectedValue1;
                    selectedRow[i].column3 = phong;
                    console.log(selectedRow[i].column1  );
                    console.log(selectedRow[i].column2  );
                }
                console.log(selectedRow.column2);
                const xhr5 = new XMLHttpRequest();
                xhr5.open("POST", "chuyenPhong");
                xhr5.setRequestHeader("Content-Type", "application/json");
                xhr5.onreadystatechange = function() {

                if (this.readyState === XMLHttpRequest.DONE && this.status === 200) {
                    let responses1 = JSON.parse(this.responseText);
                    if( responses1.key3 === "success"){         
                        alert("Chuyển phòng thành công.")
                        console.log("thành công");
                        
                        sel_chuyen_phong.style.display="none";
                        location.reload(); 
                    }
                    else if (responses1.key2 === "error1"){
                         Swal.fire({
          title: "Cảnh báo",
          text: "Phòng đã đầy",
          icon: "warning",
          confirmButtonText: "Đóng",
      });
                        console.log("error");
                         
                    }
                    else if(responses1.key4 === "error3"){
                        Swal.fire({
          title: "Cảnh báo",
          text: "Hãy chọn phòng khác",
          icon: "warning",
          confirmButtonText: "Đóng",
      });
                    }else{

                        Swal.fire({
          title: "Cảnh báo",
          text: "Bạn chưa chọn phòng",
          icon: "warning",
          confirmButtonText: "Đóng",
      });
                        console.log("warn");
                        
                    }
                              
                }
                };
                const jsonData1 = JSON.stringify(selectedRow);
                xhr5.send(jsonData1);
                console.log(selectedRow);
                }
        }
        console.log(selectedValue1);
        console.log(count);
        
    });
    
    
