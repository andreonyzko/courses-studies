print('{:=^40}'.format(' LOJA ONY '))
price = float(input('Valor do produto: R$'))
payment = input('Método de pagamento:\n- Dinheiro/cheque (-10%)\n- Cartão (-5%)\n- Até 2x no cartão (Preço normal)\n- +2x no cartão (+20%))\nEscolha: ')
print('='*40)

if payment.lower() == 'dinheiro' or payment == 'cheque':
    print('O valor final será {}'.format(price-(price*10/100)))
elif payment.lower() == 'cartão':
    print('O valor final será {}'.format(price-(price*5/100)))
elif payment.isnumeric:
    if int(payment) <= 2:
        print('O valor final será {}'.format(price))
    else:
        print('O valor final será {}'.format(price+(price*20/100)))

else:
    print('Método de pagamento inválido.')

print('='*40)