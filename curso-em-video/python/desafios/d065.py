cont = 's'
termos = media = maior = menor = 0

while cont != 'n':
    n = int(input('Digite um número: '))
    termos += 1
    media += n
    
    if termos == 1:
        maior = n
        menor = n

    if n > maior:
        maior= n
    elif n < menor:
        menor= n

    cont= ' '
    while cont not in 'sn':
        cont = input('Quer continuar? [S/N] ').strip().lower()[0]
        if cont != 's' and cont != 'n':
            print('Escolha invalida, escolha novamente.')

media /= termos
print('A média dos {} termos digitados é {:.2f}'.format(termos, media))
print('O maior valor digitado foi {} e o menor foi {}'.format(maior, menor))