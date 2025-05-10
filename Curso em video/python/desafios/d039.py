from datetime import date

age = int(input('Ano de nascimento: '))
age = date.today().year - age

if age < 18:
    print('Você ainda vai ser alistar em {} anos'.format(18-age))
elif age == 18:
    print('Está na hora de se alistar')
else:
    print('Já passou o tempo de alistamento faz {} anos'.format(age-18))