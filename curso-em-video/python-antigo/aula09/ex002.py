frase = 'olá, Mundo!'
print(len(frase))

print(frase.count('o'))
print(frase.count('o',0,3))

print(frase.find('lá'))
print(frase.find('lá',3,))
print(frase.find('Android'))

print('olá' in frase)

print(frase.replace('Mundo','world'))

print(frase.upper())
print(frase.lower())
print(frase.capitalize())
print(frase.title())

frase= '   Aprendendo Python   '
print(frase.strip())
print(frase.rstrip())
print(frase.lstrip())

print(frase.split())

frase = frase.split()
print('-'.join(frase))