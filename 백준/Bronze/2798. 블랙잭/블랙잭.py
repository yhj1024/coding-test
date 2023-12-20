N, M = map(int, input().split())

cards = sorted(list(map(int, input().split())))
sums = []

for i in range(0, N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            _sum = cards[i] + cards[j] + cards[k]
            if _sum == M:
                sums.append(_sum)
                break
            elif _sum > M:
                break
            sums.append(_sum)

print(max(sums))
