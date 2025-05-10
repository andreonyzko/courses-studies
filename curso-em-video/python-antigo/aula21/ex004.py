def somar(a=0,b=0,c=0): #variavel opciona
    """
    > Faz uma soma de três valores

    param a: o primeiro valor (opcional)
    param b: o segundo valor (opcional)
    param c: o terceiro valor (opcional)
    """
    s= a+b+c
    return s #funcao com retorno

print(f'As somas valem: {somar(3,2,5)}, {somar(8,4)} e {somar()}')
help(somar)