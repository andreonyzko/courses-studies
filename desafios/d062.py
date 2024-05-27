n = int(input('Digite o valor para a PA: '))
r = int(input('Digite a razão da PA: '))
i=0
pa = ''

while i < 10:
    pa += '{} → '.format(n)
    n +=r
    i +=1

print('{}FIM!'.format(pa))

c = ''

while c != 0:
    c= int(input('Desejar ver mais quantos termos? '))
    if c == 0:
        break
    else:
        x= 0
        pa= ''
        while x < c:
            pa += '{} → '.format(n)
            n +=r
            x +=1
        
        print('{}FIM!'.format(pa))

print('{:=^40}'.format(' PROGRAMA FINALIZADO '))

