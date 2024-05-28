palavras = ('CS2','Minecraft','RocketLeague')
vogais= ''

for palavra in palavras:
    vogais= ''
    for letra in sorted(palavra):
        if letra.lower() in 'aeiou':
            if letra.lower() not in vogais:
                vogais += f'{letra} '
    
    if len(vogais) > 0:
        print(f'Vogais em "{palavra}": {vogais}')
    else:
        print(f'Não há vogais em "{palavra}"')