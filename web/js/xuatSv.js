/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

 
    var button_xuat = document.getElementById("button_xuatSv");
    
 
     function exportToExcel() {
         let table = document.getElementById('table');
        let csv = "MA SV,HO TEN,NAM SINH,DIA CHI,PHONG\n";
        let rows = table.getElementsByTagName('tr');
        for (let i = 1; i < rows.length; i++) {
          let cells = rows[i].getElementsByTagName('th');
          let rowData = [];
          for (let j = 1; j < cells.length; j++) {
            let cellData = '';
            
              cellData = cells[j].innerText;
            
            rowData.push(cellData);
          }
          csv += rowData.join(',') + "\n";
        }

        let blob = new Blob([csv], { type: 'text/csv' });
        let link = document.createElement('a');
        link.href = window.URL.createObjectURL(blob);
        link.download = "dataSv.csv";
        link.click();
      }
     
