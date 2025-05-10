from time import sleep
def par(n=0):
    """
    > Verifica se o valor é par

    param n: número para verificar (opcional).
    return: True ou False
    """

    if n%2==0:
        return True
    else:
        return False

help(par)
print('='*40)
n= int(input('Número para verificar se é par: '))
print(f'{n} é PAR.' if par(n) else f'{n} NÃO é par.')