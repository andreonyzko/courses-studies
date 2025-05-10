def quadrado(nums):
    for i,n in enumerate(nums):
        nums[i]= n*n


values = []
for i in range(0,5):
    values.append(int(input(f'Digite valor {i+1}: ')))

quadrado(values)
print(f'Valores ao quadrado: {values}')