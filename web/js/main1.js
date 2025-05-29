/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */
//    import  {checkAll,checkboxes} from    './trangchu.js';
     
   
    export let selectedRows = [];
    export let rowData1 = {};
    export const checkAll = document.getElementById('checkboxAll1');
    export const checkboxes = document.querySelectorAll('#table .checkbox');  
    checkAll.addEventListener('click', function() {
    checkboxes.forEach(item => {
    item.checked = checkAll.checked;
    if (checkAll.checked) {
        const row1 = item.parentNode.parentNode;
        
        rowData1 = {
          column1: row1.cells[1].textContent,
          

        };
        selectedRows.push(rowData1);
    } else {
        const row1 = item.parentNode.parentNode;
       
        rowData1 = {
          column1: row1.cells[1].textContent,
          
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

    