from modulos import moeda

price= float(input("Digite o valor: R$"))
print(f'A metade de {moeda.moeda(price)} é {moeda.moeda(moeda.metade(price))}')
print(f'O dobro de {moeda.moeda(price)} é {moeda.moeda(moeda.dobro(price))}')
print(f'Com aumento de 10%, temos {moeda.moeda(moeda.aumentar(price, 10))}')
print(f'Com desconto de 13%, temos {moeda.moeda(moeda.diminuir(price, 13))}')