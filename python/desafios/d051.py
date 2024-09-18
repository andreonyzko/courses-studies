print('{:=^40}'.format(' PA '))
i = int(input('Inicio: '))
r = int(input('Razao: '))
t = i
print('-'*40)

print('Progressão Aritmética de início {} com razão {}:'.format(i,r))
for c in range(0,9):
    print('{}, '.format(t), end='')
    t += r

print('{}'.format(t))

print('='*40)