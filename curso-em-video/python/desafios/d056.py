media_idades= 0
f_menor= 0
maioridade= 0
n_maioridade = ''

for c in range(0,4):
    print('{:=^40}'.format('{}° PESSOA'.format(c+1)))
    n = input('Nome: ')
    i = int(input('Idade: '))
    s = input('Sexo: ')
    
    media_idades += i
    
    if s == 'F':
        if i < 20:
            f_menor += 1

    if s == 'M':
        if i > maioridade:
            n_maioridade = n
            maioridade = i

media_idades /= 4
print('{:=^40}'.format(' RESULT '))
print('Média de idades: {:.2f}\nNome do homem mais velho: {}\nMulheres menores de 20 anos: {}'.format(media_idades, n_maioridade, f_menor))
