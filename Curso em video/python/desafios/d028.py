import random

num = random.randint(1,5)
print(num)
inp = int(input('Digite um valor entre 1 e 5: '))
print('Você acertou o número!' if inp == num else 'Você errou!')