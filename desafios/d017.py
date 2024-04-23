import math
co = float(input('Cateto Oposto: '))
ca = float(input('Cateto adjacente: '))
print('A hipotenusa do triangulo com catetos {} e {} é {:.2f}'.format(co, ca, math.hypot(co,ca))) 