boletins= []
while True:
    aluno = []
    notas=  []
    aluno.append(input('Aluno: ').strip())
    notas.append(float(input('Nota 1: ')))
    notas.append(float(input('Nota 2: ')))
    aluno.append(notas[:])
    boletins.append(aluno[:])
    while True:
        continu= input('Quer continuar? [S/N] ').strip().lower()[0]
        if continu != 's' and continu != 'n':
            print('Escolha inválida. ', end='')
            continue
        break
    if continu == 's':
        continue
    break

print(f'{' Boletins ':=^21}')
print(f'{'ID':<3} {'NOME':<10} {'MÉDIA':^5}')
print('-'*21)
for id,b in enumerate(boletins):

    print(f'{id+1:<3} {b[0]:<10} {(b[1][0]+b[1][1])/2:^5}')
print('='*21)

while True:
    alunopesquisar= input('Mostrar notas de qual aluno? (999 para parar) ').strip()
    if alunopesquisar == '999':
        break
    else:
        for id,alunoatual in enumerate(boletins):
            if alunoatual[0].lower() == alunopesquisar.lower():
                print(f'{f' Notas de {alunoatual[0]} ':=^21}')
                print(f'1B: {alunoatual[1][0]}')
                print(f'2B: {alunoatual[1][1]}')
        print('='*21)
        continue
