import random
alunos = ['','','','']

for i in range(0, 4, 1):
    alunos[i] = input('Aluno {}: '.format(i+1))

print('O aluno sorteado foi {}'.format(alunos[random.randint(0,3)]))