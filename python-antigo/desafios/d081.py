num = []

while True:
    num.append(int(input('Digite um valor: ')))
    while True:
        continu = input('Deseja continuar? [S/N] ').strip().lower()[0]
        if continu != 's' and continu != 'n':
            print('Escolha inválida. ', end='')
            continue
        break 
    if continu == 's':
        continue
    break

print(f'{' Resultado ':=^40}')
print(f'Foram digitados {len(num)} números.')
print(f'Números decrescente: {sorted(num, reverse=True)}')
print(f'O cinco foi o {num.index(5)+1}° número digitado.' if 5 in num else 'Não foi digitado nenhum cinco.')