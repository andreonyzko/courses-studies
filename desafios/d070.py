mais = pmenor = nmenor = i = total = 0
while True:
    print(f'{' Adicionar ao Carrinho ':=^40}')
    n = input('Nome do produto: ')
    p = float(input('Preço: R$'))

    if i == 0:
        nmenor = n
        pmenor = p
    else:
        if p < pmenor:
            nmenor = n
            pmenor = p

    total += p

    if p > 1000:
        mais += 1

    i += 1

    while True:
        stop = input('Deseja continuar? [S/N]: ').strip().lower()[0]
        if stop not in ['s','n']:
            print('Escolha inválida. Tente novamente: ', end='')
            continue
        break

    if stop == 's':
        continue

    break

print(f'{'Pedido Finalizado':=^40}\nTotal: R${total:.2f}\nProdutos acima de R$1000: {mais}\nProduto mais barato: {nmenor} (R${pmenor})')