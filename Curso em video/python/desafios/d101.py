def voto(nascimento):
    from datetime import date
    age =  date.today().year - nascimento
    if age < 16:
        return f'Com {age} ainda não vota.'
    elif 16 <= age < 18 or age > 65:
        return f'Com {age} anos, teu voto é opcional.'
    else:
        return f'Com {age} anos, teu voto é obrigatório.'
    
def título(txt):
    tamanho= len(txt)+4
    print('='*tamanho)
    print(f'{txt:^{tamanho}}')
    print('='*tamanho)

título('Título Eleitoral')
22
print(voto(int(input('Ano de nascimento: '))))