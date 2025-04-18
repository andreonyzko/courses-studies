const myForm = document.querySelector('#my-form')
const nameInput = document.querySelector('#name');
const emailInput = document.querySelector('#email');
const submitBtn = document.querySelector('#submit-button');
const errorMsg = document.querySelector('.msg');
const items = document.querySelector('.items');

submitBtn.addEventListener('click', (e) => {
    e.preventDefault();

    let name = nameInput.value;
    let email = emailInput.value;

    if(name === '' || email === ''){
        errorMsg.textContent = "Please, fill all the fields!";
        errorMsg.classList = 'error';

        setTimeout(() => {
            errorMsg.textContent = '';
            errorMsg.classList = '';
        }, 3000);

        return;
    }

    const li = document.createElement('li');
    li.classList = 'item';
    li.innerHTML= `Nome: ${name} <br> Email: ${email}`;
    console.log(li);

    items.appendChild(li);

    myForm.reset();
})