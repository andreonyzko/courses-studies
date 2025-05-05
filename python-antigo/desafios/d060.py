n = int(input('Digite o número para fatoriar: '))
resultado = 1
fatorial = '{}!= '.format(n)

while n>0:
    resultado *= n
    fatorial += '{}'.format(n)
    if n > 1:
        fatorial += 'x'
    else:
        fatorial += ' = '
    n -= 1

fatorial += '{}'.format(resultado)
print(fatorial)
