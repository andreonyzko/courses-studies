players = []
while True:
    print('-'*40)
    player= {}
    goals= []
    totgoals = 0
    player['Name'] = input('Player: ')
    player['Matches'] = int(input('Matches: '))
    for i in range(0,player['Matches']):
        goals.append(int(input(f'Goals in {i+1}° match: ')))
        totgoals += goals[i]
    
    player['Total'] = totgoals
    player['Goals'] = goals
    players.append(player)

    if input('Continue? [Y/N] ').strip().upper()[0] == 'N':
        break

print('=-'*20)
print(f'{'Player':<15} {'PerMatch':<15} {'Total':^4}')
print('-'*40)
for p in players:
    print(f'{p['Name']:<15} {f'{p['Goals']}':<15} {p['Total']:^4}')
while True:
    print('=-'*20)
    searchplayer = input('See statics for wich player? [999 to stop] ').strip().lower()
    if searchplayer == '999':
        break
    for p in players:
        if p['Name'].lower() == searchplayer:
            print(f'-- {p['Name']}\'s Statics:')
            for game, ngoals in enumerate(p['Goals']):
                print(f'In match {game+1}, he scored {ngoals} goals.')
                searchplayer = 1
    if searchplayer != 1:
            print('Player not found')