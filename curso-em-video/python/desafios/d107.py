from modulos import moeda

price= float(input("Digite o valor: R$"))
print(f'A metade de {price:.1f} é {moeda.metade(price):.1f}')
print(f'O dobro de {price:.1f} é {moeda.dobro(price):.1f}')
print(f'Com aumento de 10%, temos {moeda.aumentar(price, 10):.1f}')
print(f'Com desconto de 13%, temos {moeda.diminuir(price, 13):.1f}')