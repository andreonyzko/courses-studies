media_idades = 0

print('{:=^40}'.format('1° PESSOA'))
n = input('Nome: ')
i = int(input('Idade: '))
s = input('Sexo: ')
media_idades += i

n_maioridade = n
maioridade = i
f_menor= 0
if s == 'F':
    if i < 20:
        f_menor += 1

for c in range(1,4):
    print('{:=^40}'.format('{}° PESSOA'.format(c+1)))
    n = input('Nome: ')
    i = int(input('Idade: '))
    s = input('Sexo: ')
    
    media_idades += i

    if i > maioridade:
        n_maioridade = n
    
    if s == 'F':
        if i < 20:
            f_menor += 1

media_idades /= 4
print('{:=^40}'.format(' RESULT '))
print('Média de idades: {:.2f}\nNome do mais velho: {}\nMulheres menores de 20 anos: {}'.format(media_idades, n_maioridade, f_menor))
