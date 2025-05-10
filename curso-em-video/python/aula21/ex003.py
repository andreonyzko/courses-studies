def somar(a=0,b=0,c=0): #variavel opciona
    """
    > Faz uma soma de três valores e imprime no console

    param a: o primeiro valor (opcional)
    param b: o segundo valor (opcional)
    param c: o terceiro valor (opcional)
    return: sem torno.
    """
    s= a+b+c
    print(f'A soma vale {s}')

somar(3,2,5)
somar(8,4)
somar()
help(somar)