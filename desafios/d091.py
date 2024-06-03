from random import randint
plays = {'player-one':randint(1,6),
         'player-two':randint(1,6),
         'player-three':randint(1,6),
         'player-four':randint(1,6)
         }
print(sorted(plays.values(),reverse=True))