from datetime import date

age = int(input('Ano de nascimento: '))
age = date.today().year - age

if age <= 9:
    print('MIRIM')
elif age <= 14:
    print('INFANTIL')
elif age <= 19:
    print('JUNIOR')
elif age <= 25:
    print('SENIOR')
else:
    print('MASTER')