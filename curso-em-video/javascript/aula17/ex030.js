let amigo = {
    nome: 'Kadu',
    sexo: 'M',
    idade: 19,
    envelhecer(i=1){
        this.idade += i
    }
}

amigo.envelhecer(6)
console.log(amigo.idade)