med1 = int(input('Medida 1:'))
med2 = int(input('Medida 2:'))
med3 = int(input('Medida 3:'))
print('É possível formar um triângulo com as medidas {}, {} e {}.'.format(med1, med2, med3) if med1+med2>med3 and med2+med3>med1 and med1+med3>med2 else 'Não é possível formar um triângulo com as medidas {}, {} e {}.'.format(med1, med2, med3))