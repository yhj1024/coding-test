basketCount, repeatCount = map(int, input().split())
baskets = [0] * basketCount
for i in range(0, repeatCount):
    startBsktNum, endBsktNum, ballNum = map(int, input().split())
    for j in range(startBsktNum-1, endBsktNum):
        baskets[j] = ballNum
for i in baskets:
    print(i, end=' ')