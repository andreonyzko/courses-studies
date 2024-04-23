import random

alunos= [0,0,0,0]

for i in range(0,4,1):
    alunos[i] = input('Aluno {}: '.format(i+1))

random.shuffle(alunos)

print('A ordem das apresentações será:')

for i in range(0,4,1):
    print('- ', alunos[i])
