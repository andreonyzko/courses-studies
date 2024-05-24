n = int(input('Número para tabuar: '))
for c in range(0,11,1):
    print('{} x {:2} = {}'.format(n,c,n*c))