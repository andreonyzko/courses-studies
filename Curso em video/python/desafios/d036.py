price = float(input('Valor do imóvel: '))
salary = float(input('Salário do comprador: '))
year = int(input('Quantos anos de financiamento: '))
permonth = price/(year*12)

if permonth > salary*30/100:
    print('Infelizmente seu financiamento foi negado.')
else:
    print('Financiamento concedido.')