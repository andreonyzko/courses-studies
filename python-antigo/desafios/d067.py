while True:
    print(f'{' Tabuada ':=^40}')
    n = int(input('Número para tabuar [número negativo para sair]: '))

    if n < 0:
        break

    for i in range(0,11):
        print(f'{n} x {i}= {n*i}')
    
print(f'{' Programa Encerrado ':=^40}')