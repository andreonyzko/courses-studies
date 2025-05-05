frase = input('Frase: ')
frasestrip = frase.replace(' ','')
palindromo = 1

for c in range(0,len(frasestrip)):
    if frasestrip[c].lower() != frasestrip[len(frasestrip) - c - 1].lower():
        palindromo = 0
        break

print('{:=^40}'.format(' RESULT '))

if palindromo == 0:
    print('\"{}\"\nNão é um palindromo.'.format(frase))

if palindromo == 1:
    print('\"{}\"\nÉ um palindromo.'.format(frase))

print('='*40)