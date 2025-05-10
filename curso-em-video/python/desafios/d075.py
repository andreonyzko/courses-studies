numeros = pares = ()
for c in range(0,4):
    n = int(input(f'Digite o {c+1}° valor: '))
    numeros += (n,)

print(f'{numeros}')
print(f'{' RESULTADO ':=^40}')
print(f'O nove foi informado {numeros.count(9)} vezes.' if 9 in numeros else 'Não foi informado nenhum nove.')
print(f'O primeiro três foi o {numeros.index(3)+1}° número informado.' if 3 in numeros else 'Não foi informado nenhum três.')

for c in numeros:
    if c%2==0:
        pares += (c,)

print(f'Não há números pares.' if len(pares) == 0 else f'Há {len(pares)} pare(s), sendo ele(s): ', end='')
for p in pares:
    print(f'{p} ', end='')

print('\n'+'='*40)