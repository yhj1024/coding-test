n, b = input().split()
b = int(b)
result = 0

def getValue(v):
    if v.isalpha():
        return int(ord(v) - ord('A')) + 10
    else:
        return int(v)

# n을 뒤집어서 반복문을 돌면서
# 현재 진법 ** 인덱스 * 값을 누적시킨다
for idx, i in enumerate(reversed(n)):
    result += (b ** idx) * getValue(i)

# 값을 출력한다.
print(result)
