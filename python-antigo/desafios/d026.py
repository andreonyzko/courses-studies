frase= input('Uma frase: ').strip()
print('{} letras "A"'.format(frase.upper().count('A')))
print('Posição da primeira: {}'.format(frase.upper().find('A')))
print('Posição da ultima: {}'.format(frase.upper().rfind('A')))