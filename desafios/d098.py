from time import sleep
def contador(i, f, p):
    if p > 0:
        if i < f:
            for n in range(i,f,p):
                print(f'{n} ', end=' ')
        else:
            for n in range(i,f,-p):
                print(f'{n} ', end='')
    if p < 0:
        if i < f:
            for n in range(i,f,1):
                print(f'{n} ', end='')
        else:
            for n in range(i,f,p):
                print(f'{n} ', end='')
        
    if p == 0:
        if i < f:
            for n in range(i,f,1):
                print(f'{n} ', end=' ')
        else:
            for n in range(i,f,-1):
                print(f'{n} ', end='')
    print()

for i in range(0,3):
    print('-'*30)
    contador(int(input('Inicio: ')), int(input('Fim: ')), int(input('Passo: ')))