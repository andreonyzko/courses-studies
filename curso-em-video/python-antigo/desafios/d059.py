n= [int(input('Digite o valor 1: ')), int(input('Digite o valor 2: '))]
opt = ''

while opt != 'sair':
    opt= input('{:=^30}\n[SOMAR]\n[MULTIPLICAR]\n[MAIOR]\n[NOVOS NUMEROS]\n[SAIR]\n'.format(' MENU ')+'='*30+'\n').strip().lower()
    
    while opt not in ['somar','multiplicar','maior','novos numeros','sair']:
        opt = input('Opção inválida. Tente novamente: ').strip().lower()
    
    print('{:=^30}'.format(' RESULTADO '))
    
    if opt == 'somar':
        print('A soma dos valores é: {}'.format(n[0]+n[1]))
        continue
    
    if opt == 'multiplicar':
        print('A multiplicação dos valores é: {}'.format(n[0]*n[1]))
        continue
    
    if opt == 'maior':
        if n[0] > n[1]:
            print('{} é maior que {}.'.format(n[0],n[1]))
        elif n[1] > n[0]:
            print('{} é maior que {}.'.format(n[1],n[0]))
        else:
            print('{} é igual a {}.')
        continue
    
    if opt == 'novos numeros':
        n= [int(input('Digite o valor 1: ')), int(input('Digite o valor 2: '))]
        continue

print('Programa encerrado.')