count = int(input())
rng = (count*2)-1
for i in range(1, rng+1):
    leftBlankCount = abs(i-count)
    leftBlank = ' ' * leftBlankCount
    startCount = count*2 - ((leftBlankCount*2)+1)
    start = '*' * startCount
    print(leftBlank + start)