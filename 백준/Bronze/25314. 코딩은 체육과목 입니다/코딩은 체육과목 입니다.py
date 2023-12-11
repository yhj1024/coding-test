number = int(input())
for i in range(0, number + 1, 4):
    if i == 0:
        continue
    print('long', end=' ')
    if i == number:
        print('int')