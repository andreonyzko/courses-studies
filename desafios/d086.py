matriz= [[[],[],[]],[[],[],[]],[[],[],[]]]
for l in range(0,3):
    for c in range(0,3):
        matriz[l][c].append(int(input(f'Digite um valor para [{l},{c}]: ')))

print(f'{' Resultado ':=^40}')
for l in range(0,3):
    for c in range(0,3):
        print(f'{matriz[l][c]}', end= '')
    print()

print('='*40)