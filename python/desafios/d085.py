n = [[],[]]

for i in range(0,7):
    v = int(input('Enter a value: '))
    if v % 2 == 0:
        n[0].append(v)
    else:
        n[1].append(v)

print(f'{' Result ':=^40}')
print(f'Pairs: {sorted(n[0])}')
print(f'Odd: {sorted(n[1])}')
