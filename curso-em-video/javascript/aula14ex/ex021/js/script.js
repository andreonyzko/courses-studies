function table() {
    let num = document.querySelector('#number').value
    let resultfield= document.querySelector('#resultfield')
    if(num.length == 0){
        resultfield.innerHTML = '<p>Informe um número</p>'
    } else{
        num = Number(num)
        resultfield.innerHTML = ''

        let select= document.createElement('select')
        resultfield.appendChild(select)
        select.setAttribute('size','10')
        select.style.marginTop= '1em'
        select.style.width= '100%'

        for(let i=0; i<=10; i++){
            let opt = document.createElement('option')
            select.appendChild(opt)
            opt.value= `tab${i}`
            opt.style.padding= '0.5em'

            opt.innerText= `${num}x${i} = ${num*i}`
        }
    }
}