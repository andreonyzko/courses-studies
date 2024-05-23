n = int(input('Número: '))
primo = 1

for c in range(2,n):
    if n%c == 0:
        primo = 0
        break

if primo == 0:
    print('O número {} NÃO é primo.'.format(n))

if primo == 1:
    print('O número {} é PRIMO.'.format(n))