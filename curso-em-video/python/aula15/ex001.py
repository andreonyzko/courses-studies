# n = s = 0
# 
# while n != 999:
#     n= int(input('Digite um valor: '))
#     s += n
#     
# n -= 999
# print(f'A soma vale {s}')

n = s = 0

while True:
    n= int(input('Digite um valor: '))

    if n == 999:
        break

    s += n

print(f'A soma vale {s}')