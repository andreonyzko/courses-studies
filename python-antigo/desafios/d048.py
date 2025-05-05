soma = 0
for c in range(1,501,2):
    if c%3==0:
        print(c)
        soma+= c
print('Soma final: {}'.format(soma))