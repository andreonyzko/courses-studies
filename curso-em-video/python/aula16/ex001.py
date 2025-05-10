lanche = ('Arroz', 'Feijao', 'Carne', 'Tomate')
print(lanche)
print(lanche[1])
print(lanche[-2])
print(lanche[1:3])
print(lanche[2:])
print(lanche[:2])

print('='*40)
for c in range(0,len(lanche)):
    print(f'Eu vou comer {lanche[c]} na posição {c}')
print('='*40)

for comida in lanche:
    print(f'Eu vou comer {comida}')
print('='*40)

for pos, comida in enumerate(lanche):
    print(f'Eu vou comer {comida} na posição {pos}')
print('='*40)

print(sorted(lanche))

a= (2,5,4)
b= (5,8,1,2)
c = a + b
print(c)
print(f'Tem {c.count(5)} cincos em c')
print(f'O primeiro cinco esta na posicao: {c.index(5)}')

pessoa= ('André', 19, 'M', 74)
del(pessoa)