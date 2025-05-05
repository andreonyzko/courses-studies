n = int(input('{:=^40}\nNúmero de elementos: '.format(' Sequência de Fibonacci ')))
seq = ''
antes=0
atual= 1

i= 0
while i<n:
    seq += '{} → '.format(antes)
    memory = atual
    atual += antes
    antes = memory
    i += 1

print('{}FIM!\n'.format(seq)+'='*40)