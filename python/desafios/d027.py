name = input('Seu nome: ').strip()
name = name.split()
print('Primeiro: {}'.format(name[0]))
print('Último: {}'.format(name[len(name)-1]))