matriz = [[], [], []]
for line in range(0,3):
    for colum in range(0,3):
        matriz[line].append(int(input(f'Enter a value for [{line}, {colum}]: ')))

print(f'\n{' Matriz 3x3 ':=^25}\n')
for line in matriz:
    for colum in line:
        print(f'[{colum:^5}] ', end= '')
    print()
print('\n'+'='*25)