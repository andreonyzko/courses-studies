const resultField = document.querySelector('#result-field');
const buttons = document.querySelectorAll('button');
let displayClear = true;

buttons.forEach((button) => {
    button.addEventListener('click', () => {
        let buttonValue = button.textContent;
        let displayValue = resultField.textContent;

        if(displayClear){
            resultField.textContent = '';
            displayClear = false;
        }

        switch (buttonValue) {
            case '=':
                displayValue = displayValue.replaceAll('x', '*');
                displayValue = displayValue.replaceAll('÷', '/');
                displayValue = displayValue.replaceAll('%', '/100');
                displayValue = displayValue.replaceAll(',', '.');

                try {
                    resultField.textContent = eval(displayValue);
                } catch (error) {
                    resultField.textContent = 'Calculo inválido!';
                }

                displayClear = true;
                break;

            case '()':
                let lastparentr = displayValue.lastIndexOf('(');
                let lastparentl = displayValue.lastIndexOf(')');

                if(lastparentr == -1) resultField.textContent += `(`;
                else{
                    if(lastparentr > lastparentl) resultField.textContent += `)`;
                    else resultField.textContent += `(`;
                }
                break;

            case 'del':
                resultField.textContent = displayValue.slice(0,displayValue.length-1);
                break;

            case 'AC':
                resultField.textContent = '';
                displayClear = false;
                break;
        
            default:
                resultField.textContent += buttonValue;
                break;
        }
    })
})