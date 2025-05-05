dist = int(input('Distância: '))
print('O valor da passagem será R${}'.format(dist*0.5) if dist<200 else 'O valor da passagem será R${}'.format(dist*0.45))