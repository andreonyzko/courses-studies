// 'as' cast
const inputEl = document.getElementById('login-username') as HTMLInputElement | null;

// ? check if is not null
console.log(inputEl?.value);