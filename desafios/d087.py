matriz= [[[],[],[]],[[],[],[]],[[],[],[]]]
soma = soma3c= maior2l = 0
for l in range(0,3):
    for c in range(0,3):
        n= int(input(f'Digite um valor para [{l},{c}]: '))
        matriz[l][c].append(n)
        soma += n

        if c == 2:
            soma3c += n

        if l == 1:
            if n > maior2l:
                maior2l = n

print(f'{' Resultado ':=^40}')
for l in range(0,3):
    for c in range(0,3):
        print(f'{matriz[l][c]}', end= '')
    print()

print('='*40)
print(f'A soma de todos os valores é {soma}!')
print(f'A soma da terceira coluna é {soma3c}!')
print(f'O maior valor da segunda linha é {maior2l}!')
