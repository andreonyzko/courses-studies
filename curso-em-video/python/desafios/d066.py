s = t= 0

while True:
    n = int(input('Digite um valor [999 para sair]: '))

    if n == 999:
        break

    s += n
    t += 1

print(f'A soma dos {t} números é {s}!')