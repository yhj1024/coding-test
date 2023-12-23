N, M = map(int, input().split())

S = set()
result = 0

for _ in range(N):
    S.add(input())

for _ in range(M):
    if input() in S:
        result += 1

print(result)