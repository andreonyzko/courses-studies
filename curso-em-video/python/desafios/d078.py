num = []

for i in range(0,5):
    num.append(int(input(f'Digite o {i+1}° valor: ')))

print('='*40)
print(f'Foram digitados {len(num)} números: {num}')

menor = min(num)
maior = max(num)

print(f'O menor valor foi {menor} ', end='')
print('nas posições ' if num.count(menor) > 1 else 'na posição ', end= '')
for p, v in enumerate(num):
    if v == menor:
        print(f'{p} ', end= '')
print()

print(f'O maior valor foi {maior} ', end='')
print('nas posições ' if num.count(maior) > 1 else 'na posição ', end='')
for p, v in enumerate(num):
    if v == maior:
        print(f'{p} ', end='')