nome = 'André'
idade= 19
salario = 1402.5

print('O {} tem {} anos e ganha R${:.2f}.'.format(nome, idade, salario)) #PYTHON 3
print(f'O {nome} tem {idade} anos e ganha R${salario:.2f}.') #PYTHON 3.6+

print('O %s tem %d anos.' % (nome, idade)) #PYTHON 2