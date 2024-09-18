kms = int(input('Quantidade de km rodados: '))
dias = int(input('Quantidades de dias alugado: '))
print('O valor total foi de R${:.2f} (R${:.2f} pela rodagem e R${:.2f} pelos dias)'.format(kms*0.15+dias*60, kms*0.15, dias*60))