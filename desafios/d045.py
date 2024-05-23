from random import choice
from time import sleep

options = ['pedra','papel','tesoura']
computador = choice(options)
print('{:=^40}'.format('JOKENPÔ'))
player= input('Escolha entre pedra, papel e tesoura: ')
print('-'*40)
print('PEDRA',)
sleep(1)
print('PAPEL',)
sleep(1)
print('TESOURA!')
if player.lower() == 'papel' or player.lower() == 'tesoura' or player.lower() == 'pedra':
    print('Eu joguei {}, portanto '.format(computador.upper()), end='')
    if player.lower() == 'pedra':
        if computador == 'pedra':
            print('EMPATOU!')
        elif computador == 'papel':
            print('VOCÊ PERDE!')
        elif computador == 'tesoura':
            print('VOCÊ GANHOU!')
    elif player.lower() == 'papel':
        if computador == 'pedra':
            print('VOCÊ GANHOU!')
        elif computador == 'papel':
            print('EMPATOU!')
        elif computador == 'tesoura':
            print('VOCÊ PERDEU!')
    elif player.lower() == 'tesoura':
        if computador == 'pedra':
            print('VOCÊ PERDEU!')
        elif computador  == 'papel':
            print('VOCÊ GANHOU!')
        elif computador == 'tesoura':
            print('EMPATOU!')
else:
    print('Escolha inválida.')
print('='*40)