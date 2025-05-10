exp = input('Digite a expressão: ')

if exp.count('(') == exp.count(')'):
    print('Sua expressão está correta!')
else:
    print('Sua expressão está incorreta!')