from datetime import date
year = int(input('Ano (0 para atual): '))
if year==0:
    year = date.today().year
if year%4==0 and year%100!=0 or year%400==0:
    print('{} é bissexto.'.format(year))
else:
    print('{} não é um ano bissexto.'.format(year))