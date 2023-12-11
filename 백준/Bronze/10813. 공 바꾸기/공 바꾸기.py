basketCount, repeatCount = map(int, input().split())
baskets = [0] * basketCount

# 바구니 초기화
for i in range(0, basketCount):
    baskets[i] = i+1

# 공 순서 변경
for i in range(0, repeatCount):
    start, end = map(int, input().split())
    start -= 1
    end -= 1
    temp = baskets[start]
    baskets[start] = baskets[end]
    baskets[end] = temp

# 바구니 출력
for i in baskets:
    print(i, end= ' ')
