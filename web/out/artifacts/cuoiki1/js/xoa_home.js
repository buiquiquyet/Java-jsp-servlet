/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

   
    const button_xoa = document.getElementById("button_xoa");
    import {selectedRows,rowData1,checkAll,checkboxes} from   './main1.js';
    console.log(selectedRows);
    button_xoa.addEventListener('click', function(event){
         event.preventDefault();
//         const selectedRows = [];
//         checkboxes.forEach(function(checkbox) {
//              if (checkbox.checked) {
//                   const row = checkbox.parentNode.parentNode;
//                    const rowData = {
//                    column1: row.cells[1].textContent,
//                    };
//                     selectedRows.push(rowData);        
//                }
              
//         });
         
         if (selectedRows.length === 0) {
            alert("Vui lòng chọn ít nhất một sinh viên.");
            return;
        }
          var displayedMessage = false;
        const xhr3 = new XMLHttpRequest();
        xhr3.open("POST", "delete");
        xhr3.setRequestHeader("Content-Type", "application/json");
        xhr3.onreadystatechange = function() {
           
        if (this.readyState === XMLHttpRequest.DONE && this.status === 200) {
            var responses = xhr3.responseText;
            console.log("Data sent successfully");           
                alert("Xóa sinh viên thành công.")
                 displayedMessage = true;     
        }
        location.reload(); 
        };
        const jsonData = JSON.stringify(selectedRows);
        xhr3.send(jsonData);
        console.log(selectedRows);
     });