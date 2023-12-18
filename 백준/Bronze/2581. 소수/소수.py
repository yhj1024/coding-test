M = int(input())
N = int(input())
# 소수가 담길 배열
L = []

# 소수 판별 함수
def is_prime(val):
    if val < 2:
        return False
    for i in range(2, val):
        if val % i == 0:
            return False
    return True

# 소수인 경우 배열에 담음
for i in range(M, N+1):
    if is_prime(i):
        L.append(i)

# 소수 배열 길이에 따라 분기 및 프린트 처리
if len(L) > 0:
    print(sum(L))
    print(L[0])
else:
    print(-1)
