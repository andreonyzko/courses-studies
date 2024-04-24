from random import shuffle

alunos = [input('Aluno 1: '),input('Aluno 2: '),input('Aluno 3: '),input('Aluno 4: ')]
shuffle(alunos)

print('A ordem das apresentações será: \n{}'.format(alunos))
