N = int(input())
# 소인수분해 숫자
num = 2
result = []
while num <= N:
    if N % num == 0:
        N = N // num
        result.append(num)
    else:
        num += 1

print(*result, sep='\n')
