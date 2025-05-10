
for c in range(0,5):
    p = float(input('Peso da {} pessoa: '.format(c+1)))
    if c == 0:
        maior = p
        menor = p
    if p > maior:
        maior = p
    if p < menor:
        menor = p
    
print('Maior peso: {:.2f}.\nMenor peso: {:.2f}.'.format(maior, menor))