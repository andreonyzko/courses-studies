from random import randint
from time import sleep
def maior(*num):
    sleep(0.5)
    print('-='*20)
    print('Analisando os valores passados...')
    maior= 0
    for n in num:
        print(f'{n} ', end='')
        if n > maior:
            maior = n
    if len(num) > 0:
        print()
    print(f'Foram informados {len(num)} valores.')
    print(f'O maior valor informado foi {maior}.')

maior(randint(0,10), randint(0,10), randint(0,10), randint(0,10), randint(0,10), randint(0,10))

maior(randint(0,10), randint(0,10), randint(0,10))

maior(randint(0,10), randint(0,10))

maior(randint(0,10))

maior()