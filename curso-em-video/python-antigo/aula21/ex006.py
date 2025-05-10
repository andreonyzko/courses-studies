def funcao():
    global n1
    n1= 4 #variavel global
    print(f'N1 dentro da função vale {n1}')

n1= 2 #variavel global
funcao()
print(f'N1 global vale {n1}')