from random import randint
n = randint(0,10)
tentativas = 0
palpite = ''

while palpite != n:
    palpite = int(input('Digite seu palpite de zero a dez: '))
    if palpite > n:
        print('Menos... Tente novamente.')
    if palpite < n:
        print('Mais... Tente novamente.')
    tentativas += 1

print('Você acertou com {:0>2} tentativas! O número era {}.'.format(tentativas,n))