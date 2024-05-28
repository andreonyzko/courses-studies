produtos = ('Processador E5-2650v3', 150, 'MB Huananzhi X99 TF', 900, '2x8GB 2400Mhz', 200, 'RX 6600 EAGLE', 1300, 'NEOLOGIC 500W', 150, '1TB SSD SATA', 270, '1TB HDD', 200)

print('-'*40)
print(f'{' LISTAGEM DE PREÇOS ':^40}')
print('-'*40)

for i in range(0,len(produtos),2):
    print(f'{produtos[i]}..........R${produtos[i+1]}')