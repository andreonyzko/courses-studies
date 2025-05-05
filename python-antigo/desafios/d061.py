n = int(input('Digite o valor para a PA: '))
r = int(input('Digite a razão da PA: '))
i = 0
pa = ''

while i < 10:
    pa += '{} → '.format(n)
    n +=r
    i +=1

print('{}FIM!'.format(pa))
