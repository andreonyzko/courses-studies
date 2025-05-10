def leiaint(txt):
    while True:
        n = input(txt)
        if n.isnumeric():
            return int(n)
        else:
            print('\033[0;31mERRO! Digite um número válido.\033[m')
            continue

print(f'Você digitou o número {leiaint('Digite um número inteiro: ')}.')