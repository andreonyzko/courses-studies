n1 = float(input('Nota 1: '))
n2 = float(input('Nota 2: '))
m = (n1+n2)/2
print('Sua média foi {:.1f}, portanto você foi '.format(m), end='')
print('Aprovado!' if m>=6 else 'Reprovado!')