from time import sleep
def contador(i, f, p):
    if p > 0:
        if i < f:
            for n in range(i,f+1,p):
                print(f'{n} ', end=' ', flush=True)
                sleep(0.2)
        else:
            for n in range(i,f-1,-p):
                print(f'{n} ', end='', flush=True)
                sleep(0.2)
    if p < 0:
        if i < f:
            for n in range(i,f+1,-p):
                print(f'{n} ', end='', flush=True)
                sleep(0.2)
        else:
            for n in range(i,f-1,p):
                print(f'{n} ', end='', flush=True)
                sleep(0.2)
        
    if p == 0:
        if i < f:
            for n in range(i,f+1,1):
                print(f'{n} ', end=' ', flush=True)
                sleep(0.2)
        else:
            for n in range(i,f-1,-1):
                print(f'{n} ', end='', flush=True)
                sleep(0.2)
    print()

for i in range(0,3):
    print('-'*30)
    contador(int(input('Inicio: ')), int(input('Fim: ')), int(input('Passo: ')))