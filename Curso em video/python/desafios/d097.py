def title(txt):
    length = len(txt)+4
    print('-'*length)
    print(f'{txt.upper():^{length}}')
    print('-'*length)

for i in range(0,3):
    title(input('Enter the title: '))