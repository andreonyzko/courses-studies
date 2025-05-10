n = int(input(f'{' BANCO ONY ':=^40}\nValor de saque: '))
cinquenta = vinte = dez = um = 0

while True:
    if n//50 >= 1:
        cinquenta += 1
        n -= 50
        continue
    else:
        break

while True:
    if n//20 >= 1:
        vinte += 1
        n -= 20
        continue
    else:
        break

while True:
    if n//10 >= 1:
        dez += 1
        n -= 10
        continue
    else:
        break

while True:
    if n//1 >= 1:
        um += 1
        n -= 1
        continue
    else:
        break

print(f'{' SAQUE ':=^40}')
if cinquenta > 0:
    print(f'Total de {cinquenta} cédulas de R$50')
if vinte > 0:
    print(f'Total de {vinte} cédulas de R$20')
if dez > 0:
    print(f'Total de {dez} cédulas de R$10')
if um > 0:
    print(f'Total de {um} cédulas de R$1')
print('='*40)
print('Volte sempre :)')