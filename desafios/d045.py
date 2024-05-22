from random import choice

options = ['pedra','papel','tesoura']
option = choice(options)
player= input('Escolha entre pedra, papel e tesoura: ')
print('Eu joguei {}, portanto: '.format(option))
if option == 'pedra':
    if player.lower() == 'pedra':
        print('EMPATE!')
    elif player.lower() == 'papel':
        print('VOCÊ VENCEU!')
    elif player.lower() == 'tesoura':
        print('VOCÊ PERDEU!')
elif option == 'papel':
    if player.lower() == 'pedra':
        print('VOCÊ PERDEU!')
    elif player.lower() == 'papel':
        print('EMPATE!')
    elif player.lower() == 'tesoura':
        print('VOCÊ VENCEU!')
elif option == 'tesoura':
    if player.lower() == 'pedra':
        print('VOCÊ VENCEU!')
    elif player.lower() == 'papel':
        print('VOCÊ PERDEU!')
    elif player.lower() == 'tesoura':
        print('EMPATE!')
else:
    print('Escolha inválida.')