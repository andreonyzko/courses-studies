print('='*40)
num = [2,5,9,1]
num[2]= 3
num.append(7)
num.insert(2, 0)
print(num)

num.sort()
num.sort(reverse=True)

num.pop(2)
del num[2]
num.remove(1)

print(num)
print(f'Esta lista tem {len(num)} elementos')