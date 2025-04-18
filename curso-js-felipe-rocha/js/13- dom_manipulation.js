let items = document.querySelector(".items");
let item = document.querySelectorAll(".item");

items.firstElementChild.innerText = "André";
items.firstElementChild.innerText += "Onyszko";
items.children[1].textContent = "Item dois";
items.lastElementChild.innerHTML = '<b>André</b> Onyszko'

let submit_btn = document.querySelector(".btn");
submit_btn.style.background = 'tomate';
submit_btn.style.fontWeight = 'bolder';

submit_btn.classList = ''
submit_btn.classList.add('btn', 'bg-blue')
submit_btn.classList.remove('bg-blue');
submit_btn.addEventListener('click',(e) => {
    e.preventDefault();

    submit_btn.classList.toggle('bg-blue');
})

submit_btn.setAttribute("disabled", "");
console.log(submit_btn.getAttribute("value"));
submit_btn.removeAttribute("disabled")

// items.remove();
