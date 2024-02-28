    
    
     let selectedRows = [];
     let rowData1 = {};
     const checkAll = document.getElementById('checkboxAll1');
     const checkboxes = document.querySelectorAll('#table .checkbox');  
    checkAll.addEventListener('click', function() {
    checkboxes.forEach(item => {
    item.checked = checkAll.checked;
    if (checkAll.checked) {
        const row1 = item.parentNode.parentNode;
        
        rowData1 = {
                column1: row1.cells[1].textContent,
                column2: row1.cells[2].textContent,
                column3: parseFloat(row1.cells[3].querySelector('input').value),
                
                column5: row1.cells[5].textContent,
                rowIndex: row1.rowIndex
          

        };
        selectedRows.push(rowData1);
    } else {
        const row1 = item.parentNode.parentNode;
       
        rowData1 = {
                column1: row1.cells[1].textContent,
                column2: row1.cells[2].textContent,
                column3: parseFloat(row1.cells[3].querySelector('input').value),
                
                column5: row1.cells[5].textContent,
         
                rowIndex: row1.rowIndex
        };
        const index = selectedRows.findIndex(row => row.column1 === rowData1.column1);
        selectedRows.splice(index, 1);
          }
    });
    console.log(selectedRows);
    });
    // Khi 1 checkbox được click, kiểm tra xem tất cả các checkboxes đã được chọn hay chưa
    checkboxes.forEach(item => {
        item.addEventListener('click', function() {
            const allChecked = Array.from(checkboxes).every(item => item.checked);
            checkAll.checked = allChecked;
            const row1 = item.parentNode.parentNode;
            
            rowData1 = {
                column1: row1.cells[1].textContent,
                column2: row1.cells[2].textContent,
                column3: parseFloat(row1.cells[3].querySelector('input').value),
                
                column5: row1.cells[5].textContent,
                rowIndex: row1.rowIndex
                
        };
        const index = selectedRows.findIndex(row => row.column1 === rowData1.column1);
        if (item.checked && index === -1) {
            selectedRows.push(rowData1);
        } else if (!item.checked && index !== -1) {
            selectedRows.splice(index, 1);
        }
        console.log(selectedRows);
      });
    });
    var button_tinhtien = document.getElementById("button_tinhtien");
    var button_xuat = document.getElementById("button_xuat");
    
    button_tinhtien.addEventListener('click', function(event){
         event.preventDefault();

        
         if (selectedRows.length === 0) {
            alert("Vui lòng chọn ít nhất một dòng để tính tiền.");
            return;
        }

        const xhr3 = new XMLHttpRequest();
        xhr3.open("POST", "phiPhong",true);
        xhr3.setRequestHeader("Content-Type", "application/json");
        xhr3.onreadystatechange = function() {
           
        if (xhr3.readyState === 4 && xhr3.status === 200) {
            
            var responseText = xhr3.responseText;
            var responseArray = JSON.parse(responseText);

             if(responseArray === "loi"){
                  Swal.fire({
          title: "Cảnh báo",
          text: "Số cuối kì phải cao hơn số đầu kì",
          icon: "warning",
          confirmButtonText: "Đóng",
        });
             } else{ 
                 responseArray.forEach(function(responseObj) {
                // Trích xuất giá trị 'tong' và 'rowIndex' từ đối tượng phản hồi
                var tong = responseObj.tong;
                var rowIndex = responseObj.rowIndex;
                var kw = responseObj.kw;
                console.log(rowIndex);
                // Hiển thị giá trị 'tong' trong ô cần thiết của dòng tương ứng
                var table = document.getElementById('table'); // Thay 'table' bằng id của bảng của bạn
                var cells = table.rows[rowIndex].cells; // Truy cập các ô của dòng tương ứng
                cells[6].innerText = tong.toFixed(3);
                cells[4].innerText = kw// Thay '4' bằng chỉ số cột trong bảng của bạn
            });
         }
               

        }
        
        };
       
        xhr3.send(JSON.stringify(selectedRows));
        
     });
     function exportToExcel() {
         let table = document.getElementById('table');
        let csv = "TEN PHONG,SO CUOI KI,SO DAU KI,KW SU DUNG,DON GIA,TONG TIEN\n";
        let rows = table.getElementsByTagName('tr');
        for (let i = 1; i < rows.length; i++) {
          let cells = rows[i].getElementsByTagName('th');
          let rowData = [];
          for (let j = 1; j < cells.length; j++) {
            let cellData = '';
            if (j === 3 && cells[j].querySelector('input')) {
              cellData = cells[j].querySelector('input').value;
            } else {
              cellData = cells[j].innerText;
            }
            rowData.push(cellData);
          }
          csv += rowData.join(',') + "\n";
        }

        let blob = new Blob([csv], { type: 'text/csv' });
        let link = document.createElement('a');
        link.href = window.URL.createObjectURL(blob);
        link.download = "dataTien.csv";
        link.click();
      }
     
//     button_xuat.addEventListener('click',function(e){
//        e.preventDefault(); 
//       // Tạo dữ liệu Excel từ bảng dữ liệu
//        var table = document.getElementById("table");
//        var data = [];
//        for (var i = 0; i < table.rows.length; i++) {
//          var row = table.rows[i];
//          var rowData = [];
//          // Bỏ qua cột đầu tiên (cột checkbox)
//          for (var j = 1; j < row.cells.length; j++) {
//            rowData.push(row.cells[j].innerText);
//          }
//          data.push(rowData);
//        }
//
//      // Tạo file Excel
//      var worksheet = XLSX.utils.aoa_to_sheet(data);
//      var workbook = XLSX.utils.book_new();
//      XLSX.utils.book_append_sheet(workbook, worksheet, "Sheet1");
//      var excelData = XLSX.write(workbook, { type: "binary", bookType: "xlsx" });
//
//      // Gửi file Excel tới Servlet để lưu trữ hoặc xử lý
//      var file = new File([s2ab(excelData)], "data.xlsx", { type: "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet" });
//      var formData = new FormData();
//      formData.append("file", file);
//
//      var xhr = new XMLHttpRequest();
//      xhr.open("POST", "exportTien", true);
//      xhr.onreadystatechange = function() {
//        if (xhr.readyState === 4 && xhr.status === 200) {
//          // Xử lý phản hồi từ server (nếu cần)
//          console.log(xhr.responseText);
//        }
//      };
//      xhr.send(formData);
//    });
//
//    // Chuyển đổi chuỗi dữ liệu thành ArrayBuffer
//    function s2ab(s) {
//      var buf = new ArrayBuffer(s.length);
//      var view = new Uint8Array(buf);
//      for (var i = 0; i < s.length; i++) {
//        view[i] = s.charCodeAt(i) & 0xFF;
//      }
//      return buf;
//    }
    