from datetime import date
person = {}
person['Name'] = input('Name: ')
person['Age'] = date.today().year - int(input('Birth year: '))
person['CLT'] = int(input('CLT: '))
if person['CLT'] != 0:
    person['Worked years'] = date.today().year - int(input('Hiring Year: '))
    if person['Worked years'] >= 35:
        person['Retirement'] = 'You can retire'
    else:
        person['Retirement'] = f'You will retire with {person['Age'] + (35-person['Worked years'])} years old.'
    person['Salary'] = f'U${float(input('Salary: U$'))}'

print('='*30)
print()
for k, v in person.items():
    print(f'{k}: {v}')
print()
print('='*30)