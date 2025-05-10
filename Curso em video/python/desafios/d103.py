def ficha(name='<desconhecido>', goals=0):
    print(f'O jogador {name} fez {goals} goal(s) no campeonato.')


name= input('Nome do jogador: ')

goals  = str(input('Número de goals: '))

if goals.isnumeric():
    goals= int(goals)
else:
    goals = 0

if name.strip() == '':
    ficha(goals=goals)
else:
    ficha(name,goals)