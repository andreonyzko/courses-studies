def somar(*num): #empacotando parametros passados
    soma=0
    for n in num:
        print(f'{soma} + {n} = {soma + n}')
        soma += n
    return soma

somar(0,2,3,7,123)