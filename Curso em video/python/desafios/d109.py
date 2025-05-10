from modulos import moeda

price= float(input("Digite o valor: R$"))
print(f'A metade de {moeda.moeda(price)} é {moeda.metade(price, True)}')
print(f'O dobro de {moeda.moeda(price)} é {moeda.dobro(price, True)}')
print(f'Com aumento de 10%, temos {moeda.aumentar(price, 10, True)}')
print(f'Com desconto de 13%, temos {moeda.diminuir(price, 13, True)}')