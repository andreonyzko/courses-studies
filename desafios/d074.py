from random import randint
numeros = (randint(0,10),randint(0,10),randint(0,10),randint(0,10),randint(0,10))
maior = numeros[0]
menor = numeros[0]

print('Os valores sorteados foram: ', end='')
for n in numeros:
    print(f'{n} ', end='')
    if n > maior:
        maior = n
    if n < menor:
        menor = n

print(f'\nO maior valor sorteado foi {maior}.')
print(f'O menor valor sorteado foi {menor}.')
