valores = []
while True:
    v = int(input('Digite um valor: '))
    if v not in valores:
        valores.append(v)
        print('Valor adicionado com sucesso.')
    else:
        print('Este valor já foi adicionado. ', end='')
        continue
    while True:
        continu = input('Quer continuar? [S/N] ').strip().lower()[0]
        if continu != 's' and continu != 'n':
            print('Escolha invalida. ', end= '')
            continue
        break
    if continu == 's':  
        continue
    break

print('=-'*20)
valores.sort()
print(f'Você digitou os valores {valores}')