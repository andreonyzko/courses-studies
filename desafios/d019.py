import random
alunos = [0,1,2,3]

for i in range(0, 4, 1):
    alunos[i] = input('Aluno {}: '.format(i+1))

print('O aluno sorteado foi {}'.format(alunos[random.randint(0,3)]))