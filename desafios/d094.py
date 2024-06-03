people = []
females = []
avaregeage = 0
while True:
    person= {}
    person['Name'] = input('Name: ').strip().capitalize()
    person['Gender'] = input('Gender: ').strip().upper()[0]
    person['Age'] = int(input('Age: '))
    people.append(person)

    avaregeage += person['Age']

    if person['Gender'] == 'F':
        females.append(person['Name'])

    if input('Continue? [Y/N] ').strip().upper()[0] == 'N':
        break

avaregeage /= len(people)

print('='*30)
print(f'Registered {len(people)} people.')
print(f'Ages avarege is {avaregeage}.')
print(f'Females: {females}')
print(f'People with age avobe average: ')
for p in people:
    if p['Age'] > avaregeage:
        print(f'    {p['Name']} aged {p['Age']}.')
print('='*30)