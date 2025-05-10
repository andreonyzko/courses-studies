pessoas = {
    'nome': 'Andre',
    'idade': 19,
    'sexo': 'M'
}
print('='*20)
for element,value in pessoas.items(): # element = chaves, value = valores
    print(f'{element}: {value}')

print('='*20)
del pessoas['sexo'] # deletando elemento do dicionario

for element,value in pessoas.items():
    print(f'{element}: {value}')

print('='*20)
pessoas['nome'] = 'Gustavo' # trocando valor dentro de um dicionario
pessoas['idade'] = 46 # trocando valor dentro de um dicionario

for element,value in pessoas.items():
    print(f'{element}: {value}')

print('='*20)
pessoas['Profissão'] = 'professor' # adicionando um dicionario

for element,value in pessoas.items():
    print(f'{element}: {value}')

print('='*20)