from math import sin, cos, tan, radians
degree = float(input('Digite o ângulo: '))
print('O senno de {} é {:.2f}, o cosseno é {:.2f}, e a tangente é {:.2f}'.format(degree, sin(radians(degree)), cos(radians(degree)), tan(radians(degree))))