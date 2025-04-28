from random import randint
from time import sleep
totjogos = []
jogo = []
print('-'*40)
print(f'{'Quantos jogos devo sortear?':^40}')
print('-'*40)
palpites = int(input(f'Quantos jogos devo sortear? '))

for p in range(0,palpites):
    gerados= 0
    while gerados <6:
        n = randint(1,60)
        if n in jogo:
            continue
        else:
            jogo.append(n)
            gerados+= 1
    totjogos.append(jogo[:])
    jogo.clear()

print(f'\n{f' Sorteando {palpites} jogos ':=^40}')
for j,palpite in enumerate(totjogos):
    print(f'Jogo {j+1}: {palpite}')
    sleep(0.5)
print('='*40)