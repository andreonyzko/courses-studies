grade = float(input('Nota primeiro semestre: '))
grade += float(input('Nota do segundo semestre: '))
grade /= 2
print('Sua média é {:.2f}'.format(grade))

if grade < 5.0:
    print('REPROVADO.')
elif grade >= 5.0 and grade <= 6.9:
    print('RECUPERAÇÃO')
else:
    print('APROVADO')