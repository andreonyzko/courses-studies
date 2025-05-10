var values= [], resultfield = document.querySelector('#result')

function adicionar() {
    let number = document.querySelector('#number').value
    let numberinp = document.querySelector('#number')

    if(verifyNumber(number) && !verifyInList(number)){
        let valuesfield = document.querySelector('#values')
        values.push(Number(number))
        valuesfield.innerHTML += `<option>Valor ${number} adicionado</option>`
        resultfield.innerHTML = ``
    } else{

    }
    numberinp.value = ''
    numberinp.focus()
}

function verifyNumber(number) {
    if(number.length == 0){
        alert('Informe um número entre 1 a 100')
        return false
    } else if(number < 1 || number > 100){
        alert('O número deve ser entre 1 e 100')
        return false
    } else{
        return true
    }
}

function verifyInList(number){
    if(values.indexOf(number) != '-1'){
        alert('Valor já adicionado, informe outro')
        return true
    } else{
        return false
    }
}

function finalizar() {
    if(values.length == 0){
        alert("Adicione valores para finalizar!")
    } else{
        values.sort()
        let length= values.length, soma=0, maior= values[0], menor= values[0]

        for(let pos in values){
            soma += values[pos]
            if(values[pos] > maior)
                maior = values[pos]
            if(values[pos] < menor)
                menor = values[pos]
        }
        resultfield.innerHTML = `<p>Ao todo, temos ${length} números cadastrados.</p>`
        resultfield.innerHTML += `<p>O maior valor informado foi ${maior}</p>`
        resultfield.innerHTML += `<p>O menor valor informado foi ${menor}</p>`
        resultfield.innerHTML += `<p>Somando todos os valores temos ${soma}</p>`
        resultfield.innerHTML += `<p>A média dos valores digitados é ${soma/length}</p>`
    }
}