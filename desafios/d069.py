maior = homens = mulheres_menores = 0

while True:
    print(f'{' Cadastro ':=^40}')
    n = input('Nome: ')
    i = int(input('Idade: '))
    while True:
        s = input('Sexo [M/F]: ').strip().upper()[0]
        if s not in ['M','F']:
            print('Sexo invalido. Informe novamente o ', end='')
            continue
        else:
            break
    
    if i > 18:
        maior += 1
    
    if s == 'M':
        homens += 1
    
    if s == 'F' and i<20:
        mulheres_menores += 1
    
    while True:
        stop = input('Deseja continuar? [S/N]: ').strip().lower()[0]
        if not stop in ['s','n']:
            print('Escolha inválida. Tente novamente: ', end='')
            continue
        break
    
    if stop == 'n':
        break

print(f'{' Resultado ':=^40}\nMaior de 18 anos: {maior}.\nHomens cadastrados: {homens}.\nMulheres menores de 20 anos: {mulheres_menores}.\n'+'='*40)
        
    