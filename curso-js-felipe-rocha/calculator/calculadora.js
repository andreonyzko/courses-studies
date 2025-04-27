const resultfield = document.querySelector('#result-field');
const buttons = document.querySelector('#buttons');
console.log(resultfield);
let displayresultado = 0;

buttons.addEventListener('click', (e) =>{
    const botao = e.target.textContent;
    if(e.target.tagName !== 'BUTTON') return;
    if(botao === '='){
        try{
            resultfield.textContent = (eval(resultfield.value));
        } catch{
            resultfield.textContent = 'Erro de operação!';
        }
        displayresultado = 1;
    }
    else if(botao === 'C'){
        resultfield.textContent = '';
    }
    else{
        if(displayresultado === 1){
            resultfield.textContent = '';
            displayresultado = 0;
        }
        resultfield.textContent += botao;
    }
})