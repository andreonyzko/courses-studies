registers= []
user = []

for c in range(0,4):
    print(f'{' Data register ':=^40}')
    user.append(input('Name: '))
    user.append(int(input('Age: ')))
    registers.append(user[:])
    user.clear()

print('Data registered successfully.')

print(f'{' Data List ':=^40}')
for d in registers:
    print(f'User:')
    print(f'    Name: {d[0]}')
    print(f'    Age: {d[1]}')

print(f'{' 18+ ':=^40}')
for d in registers:
    if d[1] > 18:
        print('User: ')
        print(f'    Name: {d[0]}')
        print(f'    Age: {d[1]}')