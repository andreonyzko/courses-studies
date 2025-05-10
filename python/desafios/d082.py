num = []
pares= []
impares = []

while True:
    num.append(int(input('Digite um valor: ')))
    while True:
        continu = input('Deseja continuar? [S/N] ').strip().lower()[0]
        if continu != 's' and continu != 'n':
            print('Escolha Inválida. ', end='')
            continue
        break
    if continu == 's':
        continue
    break

for n in num:
    if n%2 == 0:
        pares.append(n)
    else:
        impares.append(n)

print(f'{' Resultado ':=^40}')
print(f'Números digitados: {num}')
print(f'Pares: {pares}')
print(f'Ímpares: {impares}')
print('='*40)