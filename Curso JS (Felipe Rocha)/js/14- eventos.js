const submitButton = document.querySelector('#submit-button');
const myForm = document.querySelector('#my-form');
const userInput = document.querySelector('#name');
const emailInput = document.querySelector('#email');
const items = document.querySelector(".items");
const item = document.querySelectorAll(".item");

myForm.addEventListener('submit', function (e) {
    e.preventDefault();

    let user = userInput.value;
    let email = emailInput.value;

    if (user === '' || email === '') {
        alert('Preencha todos os campos!');
        return;
    }
    console.log(`${user}: ${email}`);

    myForm.reset();
})

item[0].addEventListener('click', () => {
    item[0].classList.toggle('bg-blue');
})

item[1].addEventListener('mouseover', () => {
    item[1].classList.toggle('bg-blue');
})

document.addEventListener('keydown', (e) => {
    if(e.code === 'Space'){
        alert("Apertou espaço");
    }
    item[2].classList.toggle('bg-blue');
})

