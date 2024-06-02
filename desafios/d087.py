matriz = [[], [], []]
pairssum = 0
col3sum = 0
lin2largest = 0
for line in range(0,3):
    for colum in range(0,3):
        v = int(input(f'Enter a value for [{line}, {colum}]: '))
        matriz[line].append(v)
        if v%2 == 0:
            pairssum += v
            
        if colum==2:
            col3sum += v
        
        if line == 1:
            if v > lin2largest:
                lin2largest = v
           

print(f'\n{' Matriz 3x3 ':=^25}\n')
for line in matriz:
    for colum in line:
        print(f'[{colum:^5}]', end= '')
    print()
print(f'\nThe sum of the pairs is {pairssum}.')
print(f'The sum of the 3rd colum is {col3sum}.')
print(f'The largest number in line 2 is {lin2largest}.')
print('\n'+'='*25)