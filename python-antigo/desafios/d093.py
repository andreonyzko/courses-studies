player = {}
goals= []
totgoals = 0
player['Name'] = input('Player\'s Name: ')
player['Matches'] = int(input('Matches: '))
for i in range(0,player['Matches']):
    goals.append(int(input(f'Goals in {i+1} match: ')))
    totgoals += goals[i]

player['Goals'] = goals
player['Goals average'] = totgoals/len(goals)

print('='*40)
print()
print(f'The Player {player['Name']} played {player['Matches']} games.')

for match, ngoals in enumerate(player['Goals']):
    print(f'     -> In {match+1}° match, did {ngoals} goals.')

print(f'Was a total of {totgoals} goals.')
print(f'Average goals per match of {player['Goals average']}.')
print()
print('='*40)