from random import randint
def sortear(nums):
    for i in range(0,5):
        n= randint(0,10)
        nums.append(n)
        print(f'Sortiei o número {n}')

def somar(nums):
    soma=0
    for n in nums:
        if n%2 ==0:
            soma += n
    return soma

numeros = []
sortear(numeros)
print(f'A soma dos números pares do conjunto {numeros} foi: {somar(numeros)}')