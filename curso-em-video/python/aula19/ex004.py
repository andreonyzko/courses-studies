brazil = []
estate= {}

for i in range(0,2):
    estate['uf'] = input('State: ')
    estate['acronym'] = input('Acronym: ')
    brazil.append(estate.copy()) # copia um dicionario com .copy()
    estate.clear() # limpa dicionario com .clear()

for i,estate in enumerate(brazil):
    print(f'{f' STATE {i+1} ':=^20}')
    print()
    for k, v in estate.items():
        print(f'{k}: {v}')
    
    print()

print('='*20)