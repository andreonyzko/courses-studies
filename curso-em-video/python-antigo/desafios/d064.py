i = 0
v = ''
soma = 0
while v != 999:
    v = int(input('Digite o {}° valor [999 para parar]: '.format(i+1)))

    if v == 999:
        break

    i += 1
    soma += v

print('A soma dos {} termos é {}.'.format(i,soma))