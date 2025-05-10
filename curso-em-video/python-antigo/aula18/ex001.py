teste = []
teste.append('Andre')
teste.append(19)
galera= []
galera.append(teste[:])
teste[0] = 'Gustavo'
teste[1] = 40
galera.append(teste[:])

print(galera)