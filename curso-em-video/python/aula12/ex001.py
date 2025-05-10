nome = input('Qual é seu nome? ')

if nome == 'Andre':
    print('Que nome bonito!')
elif nome == 'Pedro' or nome == 'Maria' or nome=='Paulo':
    print('Seu nome é bem popular no Brasil.') 
elif nome in 'Ana Claudia Jessica Juliana':
    print('Belo nome feminino!')
else:
    print('Que nome diferenciado!')

print('Tenha um bom dia, {}!'.format(nome))