num = []
for i in range(0,5):
    n = int(input('Digite um valor: '))

    if i == 0 or n > num[len(num)-1]:
        num.append(n)
        print('Valor adicionado ao final da lista.')
    
    else:
        for p, v in enumerate(num):
            if n > v:
                continue
            else:
                num.insert(p, n)
                print(f'Valor adicionado a {p}° posição.')
                break

print(f'{' Ordem crescente ':=^40}')
print(num)
print('='*40)
