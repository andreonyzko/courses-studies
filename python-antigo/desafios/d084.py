user = []
registers= []
heavys = slights = ''
heavy = slight = i = 0

while True:
    print(f'{' User register ':=^40}')
    user.append(input('Name: '))
    user.append(float(input('Weight: ')))
    registers.append(user[:])
    
    
    if i == 0:
        heavy = user[1]
        slight = user[1]

    if user[1] >= heavy:
        heavy = user[1]

    if user[1] <= slight:
        slight = user[1]

    user.clear()
    i += 1

    while True:
        continu = input('Deseja continuar? [S/N] ').strip().lower()[0]
        if continu != 's' and continu != 'n':
            print('Invalid Choice. ', end='')
            continue
        break
    if continu == 's':
        continue
    break

for u in registers:
    if u[1] == heavy:
        heavys += f' {u[0]}'
    if u[1] == slight:
        slights += f' {u[0]}'

print(f'{' Results ':=^40}')
print(f'Was registered {i} people.')
print(f'The greatest weight was {heavy:.1f}kg.({heavys})')
print(f'The lowest weight was {slight:.1f}kg.({slights})')