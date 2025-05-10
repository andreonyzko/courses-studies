from time import sleep
def fatorial(n=1):
    """
    > Faz o fatorial de um número.

    param n: número para fatoriar (opcional).
    """

    fatorial= 1
    print(f'{n}! = ', end='')
    for n in range(n,1,-1):
        fatorial *= n
        print(f'{n} x ', end='', flush=True)
        sleep(0.3)

    return fatorial

help(fatorial)
print('='*40)
n= int(input('Número para fatoriar: '))
print(f'1 = {fatorial(n)}')