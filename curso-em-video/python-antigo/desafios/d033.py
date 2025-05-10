n1 = int(input('Valor 1: '))
n2 = int(input('Valor 2: '))
n3 = int(input('Valor 3: '))
maior=n1
menor=n1
if n2>n1 and n2>n3:
    maior=n2
elif n3>n1 and n3>n2:
    maior=n3

if n2<n1 and n2<n3:
    menor=n2
elif n3<n1 and n3<n2:
    menor=n3

print('Maior valor: {}\nMenor valor: {}'.format(maior,menor))