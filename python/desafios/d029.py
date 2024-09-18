vel = int(input('Velocidade do carro: '))
print('Você foi multado em R${}.'.format((vel-80)*7) if vel > 80 else 'Dentro do limite de velocidade.')