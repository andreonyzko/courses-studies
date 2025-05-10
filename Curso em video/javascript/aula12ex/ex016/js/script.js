function verify() {
    var yearbirth = Number(document.querySelector('#yearbirth').value)
    var currentyear= new Date().getFullYear()
    var age= currentyear-yearbirth
    if(age<0){
        alert('[ERRO] ano de nascimento futuro')
    } else{
        var gender= document.getElementsByName('gender')

        var containerresult = document.querySelector('#container-result')
        containerresult.innerHTML = ''

        var txtresult= document.createElement('p')
        containerresult.appendChild(txtresult)

        var imgresult = document.createElement('img')
        containerresult.appendChild(imgresult)
        imgresult.style.width = '250px'
        imgresult.style.borderRadius= '50%'

        var genderresult= ''
        if(gender[0].checked){
            gender = 'mas'
            genderresult= 'um homem'
        } else if(gender[1].checked){
            gender= 'fem'
            genderresult= 'uma mulher'
        }

        txtresult.innerText= `Encontramos ${genderresult} de ${age} anos.`
        
        if (age<10){
            imgresult.src = `media/crianca-${gender}.jpg`
        } else if(age < 20){
            imgresult.src= `media/jovem-${gender}.jpg`
        } else if(age<50){
            imgresult.src = `media/adulto-${gender}.jpg`
        } else {
            imgresult.src= `media/idoso-${gender}.jpg`
        }
    }
}