student = {}
student['Name'] = input('Name: ')
student['Media'] = float(input('Media: '))
if student['Media'] >= 6:
    student['Situation'] = 'Approved'
else:
    student['Situation'] = 'Disapproved'

print(f'{f' STUDENT {student['Name'].upper()} ':=^40}')
for k, v in student.items():
    print(f'{k}: {v}')
print('='*40)