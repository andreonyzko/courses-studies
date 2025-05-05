from time import sleep
def titulo(txt, cor):
    sleep(0.5)
    tamanho = len(txt)+4
    print(f'{cor}~'*tamanho)
    print(f'{txt:^{tamanho}}')
    print('~'*tamanho+'\033[m')

def search(biblio):
    sleep(0.5)
    print('\033[1;30;47m')
    help(biblio)
    print('\033[m')

while True:
     
     titulo('SISTEMA DE AJUDA PyHELP', '\033[1;30;43m')

     biblioteca = input('Função ou biblioteca > ').strip().lower()
     if biblioteca == 'fim':
          break
     
     titulo(f'Acessando o manual do comando \'{biblioteca}\'', '\033[1;30;47m')
     search(biblioteca)
     