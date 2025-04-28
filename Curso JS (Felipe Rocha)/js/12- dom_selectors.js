// let addUserText = document.getElementById('add-user');
// console.log(addUserText);
// addUserText.innerText = "Adicionar Usuário";

// Query Selector
let addUserTxt = document.getElementById('add-user');
addUserTxt = document.getElementsByClassName('btn');
addUserTxt = document.getElementsByTagName('input');
addUserTxt = document.querySelector('#add-user');
console.log(addUserTxt)
addUserTxt.innerText = "Add user";

let myForm = document.querySelector(".container > #my-form");
console.log(myForm);

// Selecionar multiplos elementos

// document.querySelector(".item"); <--- Vai selecionar só o primeiro item da classe
let allItems = document.querySelectorAll(".item"); // Vai retornar uma lista com todos os elementos da classe
console.log(allItems);

// Outras formas
let items = document.querySelector(".item");
console.log(items.firstElementChild);
console.log(items.children);
console.log(items.children[1]);
console.log(items.lastElementChild);
console.log(allItems[0].textContent) // Coleta todo o texto
console.log(allItems[0].innerText) // Não coleta textos com display none



