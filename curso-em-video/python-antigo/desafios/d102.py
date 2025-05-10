def fatorial(n=1, show=False):
    fatorial = 1
    for i in range(n,1,-1):
        fatorial *= i
        if show:
            print(f'{i} x ', end='')

    if show:
        print(f'1 = {fatorial}')
    
    return fatorial

n= int(input('Número para fatorial: '))
show = input('Mostrar calculo? [True ou False] ').strip().upper()[0]
if show == 'T':
    show=True
elif show=='F':
    show=False

print(f'{' RESULTADO ':=^40}')
print(f'O fatorial de {n} é {fatorial(n,show)}')