from math import hypot
co = float(input('Cateto Oposto: '))
ca = float(input('Cateto adjacente: '))
print('A hipotenusa do triangulo com catetos {} e {} é {:.2f}'.format(co, ca, hypot(co,ca))) 