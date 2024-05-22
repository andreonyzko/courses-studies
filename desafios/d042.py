hip= float(input('Hipotenusa: '))
ca= float(input('Cateto Adjacente: '))
co= float(input('Cateto Oposto: '))

if hip < ca+co and ca < hip+co and co < hip+ca:
    if hip == ca and ca == co:
        print('Triângulo Equilátero.')
    elif hip == ca or hip == co or ca == co:
        print('Triângulo Isósceles')
    else:
        print('Triângulo Escaleno')
else:
    print('Não é possível criar um triângulo com essas medidas')