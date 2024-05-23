number = int(input('Número para conversão: '))
choice = int(input('Escolha umas das opções: \n1- Binário\n2- Octal\n3- Hexadecimal\n'))

if choice == 1:
    result = bin(number)[2:]
    choice = 'binario'
elif choice == 2:
    result = oct(number)[2:]
    choice = 'octal'
elif choice == 3:
    result = hex(number)[2:]
    choice = 'hexadecimal'
else:
    print('Escolha inválida!')

if choice == 'binario' or choice == 'octal' or choice == 'hexadecimal':
    print('{} em {} é {}'.format(number, choice, result))