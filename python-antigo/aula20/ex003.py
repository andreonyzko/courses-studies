def somar(x,y):
    return x+y

def linha():
    print('-'*30)

for i in range(0,3):
    linha()
    print(f'A soma dos dois números é: {somar(int(input('Digite o valor 1: ')), int(input('Digite o valor 2: ')))}')
linha()