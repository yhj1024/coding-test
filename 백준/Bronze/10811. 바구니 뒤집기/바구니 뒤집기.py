basketCount, repeatCount = map(int, input().split())
baskets = [0] * basketCount

# 바구니 초기화
for i in range(0, basketCount):
    baskets[i] = i+1

# 리버스 처리
for i in range(0, repeatCount):
    start, end = map(int, input().split())
    tempBaskets = baskets[start-1: end]
    tempBaskets.reverse()
    baskets[start-1: end] = tempBaskets

# 바구니 출력
for i in baskets:
    print(i, end= ' ')