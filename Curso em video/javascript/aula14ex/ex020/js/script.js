function count() {
    let start = document.querySelector('#start').value
    let end = document.querySelector('#end').value
    let jump= document.querySelector('#jump').value
    let resultfield= document.querySelector('#resultfield p')

    if(start.length == 0 || end.length == 0 || jump.length == 0){
        resultfield.innerText = 'Impossível contar!'
    } else{
        start = Number(start)
        end = Number(end)
        jump = Number(jump)

        if(jump == 0){
            jump= 1
        }
        
        resultfield.innerText = ''

        if(start <= end){
            for(let i=start; i<=end; i+=jump){
                resultfield.innerText += `${i} 👉 `
            }
        } else if (start > end){
            for(let i=start; i>=end; i-=jump){
                resultfield.innerText += `${i} 👉 `
            }
        }

        resultfield.innerText+= `🏁`
    }
}