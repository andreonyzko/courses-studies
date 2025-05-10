maior = 0
menor = 0

for c in range(0,7):
    age = int(input('Idade da {}° pessoa: '.format(c+1)))
    if age >= 21:
        maior += 1
    else:
        menor += 1

print('Das 7 pessoas, {} antingiram a maioridade, e {} não atingiram.'.format(maior, menor))