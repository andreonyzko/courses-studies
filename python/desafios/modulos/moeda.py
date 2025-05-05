def aumentar(p, v, format=False):
    if format:
        return moeda(p+(p*v/100))
    else:
        return p+(p*v/100)

def diminuir(p, v, format=False):
    if format:
        return moeda(p-(p*v/100))
    else:
        return p-(p*v/100)

def dobro(p, format=False):
    if format:
        return moeda(p*2)
    else:
        return p*2

def metade(p, format=False):
    if format:
        return moeda(p/2)
    else:
        return p/2

def moeda(p):
    return f'R${p:.2f}'.replace('.',',')

def resumo(p, a, d):
    print(f'-'*40)
    print(f'{' RESUMO DO VALOR ':^40}')
    print(f'-'*40)
    print(f'{'Preço analisado:':<30}'+ f'{moeda(p)}')
    print(f'{'Dobro do preço:':<30}'+ f'{dobro(p, True)}')
    print(f'{'Metade do preço:':<30}'+ f'{metade(p, True)}')
    print(f'{f'{a}% de aumento:':<30}'+ f'{aumentar(p, a, True)}')
    print(f'{f'{d}% de desconto:':<30}'+ f'{diminuir(p, d, True)}')
    print('-'*40)