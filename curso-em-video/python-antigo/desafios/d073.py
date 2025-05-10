colocados= ('Athletico-PR','Bahia','Flamengo','Botafogo','São Paulo','Cruzeiro','Atlético-MG','Bragantino','Palmeiras','Internacional','Fortaleza','Grêmio','Vasco da Gama','Criciúma','Juventude','Corinthias','Chapecoense','EC Vitória','Atlético-GO','Cuiabá')

print(f'{' TOP 5 ':=^40}')
for pos,c in enumerate(colocados[:5]):
    print(f'{pos+1}° - {c}')

print(f'{' 4 ÚLTIMOS ':=^40}')
for pos,c in enumerate(colocados[16:]):
    print(f'{pos+17}° - {c}')

print(f'{' ORDEM ALFABÉTICA ':=^40}')
for c in sorted(colocados):
    print(f'- {c}')


print(f'{' COLOCAÇÃO CHAPECOENSE ':=^40}\nA Chapecoense está em {colocados.index('Chapecoense')+1}° colocado.')