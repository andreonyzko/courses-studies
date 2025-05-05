s = 0
for c in range(0,6,1):
    n = int(input('{}° número: '.format(c+1)))
    if n%2 == 0:
        s += n
print('Soma final: {}'.format(s))