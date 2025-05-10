def notas(*notas, sit=False):
    resp = {}
    resp['total']= len(notas)
    resp['maior']= max(notas)
    resp['menor']= min(notas)
    resp['media'] = sum(notas)/len(notas)

    if sit:
        if resp['media'] < 6: resp['situação']= 'RUIM'
        elif 6 <= resp['media'] <= 7: resp['situação'] = 'RAZOAVEL'
        elif 7 <= resp['media'] <9: resp['situação'] = 'BOA'
        elif resp['media'] >= 9: resp['situação'] = 'ÓTIMA'
    
    return resp

print(notas(10, 10, 8, 8, 8, sit=True))