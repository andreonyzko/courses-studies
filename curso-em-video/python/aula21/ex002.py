def count(i,f,p):
    """
    -> Faz uma contagem e mostra na tela.

    :param i: início da contagem;
    :param f: final da contagem;
    :param p: passo da contagem;
    :return: sem retorno.
    """ #docstring
    
    for n in range(i,f+1,p):
        print(f'{n} ', end=' ')
    print()

help(count)