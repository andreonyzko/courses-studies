function carregar() {
    var msgfield= document.querySelector('#msg')
    var img= document.querySelector('#img>img')
    var body= document.querySelector('body')
    var now= new Date()
    var hour= now.getHours()
    var minutes= now.getMinutes()
    msgfield.innerHTML = `<p>Agora são ${hour}h${minutes}m</p>`

    if (hour>0 && hour<12){
        img.src= 'media/manha.jpg'
        body.style.background= '#fcdd95'
    } else if(hour<=18){
        img.src= 'media/tarde.jpg'
        body.style.background= '#DE9942'
    } else if(hour>18 && hour<=23){
        img.src= 'media/noite.jpg'
        body.style.background= '#011F3A'
    } else{
        msgfield.innerHTML = `<p>ERRO: hora invalida</p>`
        img.src= ''
    }
}