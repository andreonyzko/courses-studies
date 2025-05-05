sexo = input('Digite seu sexo [F/M]: ').strip().upper()[0]

while sexo not in 'FM':
    sexo = input('Escolha invalida. Digite novamente o sexo de uma pessoa [F/M]: ')

if sexo == 'F':
    print('Você é do sexo Feminimo!')

elif sexo == 'M':
    print('Você é do sexo Masculino!')