N = int(input())
num = 666
cnt = 1

while True:
    if N == cnt:
        print(num)
        break
    num += 1
    numStr = str(num)
    if '666' in numStr:
        cnt += 1