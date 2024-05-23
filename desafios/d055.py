p = float(input('Peso da 1° pessoa: '))
maior = p
menor = p

for c in range(1,5):
    p = float(input('Peso da {} pessoa: '.format(c+1)))
    if p > maior:
        maior = p
    if p < menor:
        menor = p
    
print('Maior peso: {}.\nMenor peso: {}.'.format(maior, menor))