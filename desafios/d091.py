from random import randint
from operator import itemgetter
from time import sleep
plays = {'player-one':randint(1,6),
         'player-two':randint(1,6),
         'player-three':randint(1,6),
         'player-four':randint(1,6)
         }
for player, dicenum in plays.items():
    print(f'{player} rolling dice..: ', end='')
    sleep(1)
    print(f'{dicenum}')

ranking = sorted(plays.items(), key=itemgetter(1), reverse=True)

print()
print(f'{' RANKINGTOP ':=^40}')
print()
for pos, play in enumerate(ranking):   
        print(f'{pos+1}st place: {play[0]} ({play[1]}).')
        print()
print('='*40)