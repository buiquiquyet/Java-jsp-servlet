/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

var n = 0;

const headerIcon = document.getElementById("header_icon");
const overlayMenu = document.querySelector(".overlay_menu");
const headerMenu = document.getElementById("header_nav");
const header = document.getElementById("header");

header.addEventListener('click', e => {

    e.preventDefault();

    // headerMenu.style.display = "none";
    // overlayMenu.style.display = "none";
    if (e.target.matches("#header_icon") && n % 2 == 0 || e.target.matches("#icon_menu") && n % 2 == 0) {
        headerMenu.style.display = "flex";
        overlayMenu.style.display = "block";
    } else {
        headerMenu.style.display = "none";
        overlayMenu.style.display = "none";
    }
    n++;
});


overlayMenu.addEventListener('click', e => {
    e.preventDefault();
    n++;
    overlayMenu.style.display = "none";
    headerMenu.style.display = "none";
});
