from random import randint
vitorias = 0

while True:
    computer = randint(1,100)
    play = input('Escolha par ou ímpar: ').strip().lower()

    if not play in ['impar','par']:
        print('Escolha inválida. Jogue novamente.')
        continue

    n = int(input('Faça sua jogada: '))

    if play == 'par':
        if (computer+n)%2 == 0:
            print(f'Eu joguei {computer} e você {n}. A soma das jogadas é {computer+n}. Então, você ganhou!')
            vitorias += 1
        else:
            break

    elif play == 'impar':
        if (computer+n)%2 != 0:
            print(f'Eu joguei {computer} e você {n}. A soma das jogadas é {computer+n}. Então, você ganhou!')
            vitorias += 1
        else:
            break

print(f'Eu joguei {computer} e você {n}. A soma das jogadas é {computer+n}. Então, você perdeu!')
print(f'{' End Game ':=^40}')
print(f'Você atingiu um winstreak de {vitorias} vitorias!')
print(f'{' End Game ':=^40}')