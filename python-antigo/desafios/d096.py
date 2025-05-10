def area(larg, comp):
    return larg*comp
def lin():
    print('='*30)

lin()
print(f'{' Controle de Terrenos ':^30}')
lin()
print(f'A área do terreno com as dimensões informadas é {area(float(input('Largura (m): ')), float(input('Comprimento (m): ')))}m²')