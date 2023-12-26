# 가로수를 최소한으로 심으면서 가로수 간의 거리를 일정하게 하려면
# 가로수 간의 거리를 최대 공약수 만큼 일정하게 하면된다

N = int(input())
diffs = []
last = 0
diff_lcm = -1
result = 0


def lcm(a, b):
    while a % b != 0:
        tmp = b
        b = a % b
        a = tmp
    return b


for _ in range(N):
    now = int(input())
    if _ != 0:
        diff = now - last
        diffs.append(diff)
    last = now

for i in diffs:
    if diff_lcm == -1:
        diff_lcm = i
    else:
        diff_lcm = lcm(i, diff_lcm)

# 최소 공배수가 2인 경우 가로수 차이간 심어야 할 가로수 갯수
# 2 차이 : 0개
# 4 차이 : 1개
# 6 차이 : 2개
# 8 차이 : 3개
# 10 차이 : 4개
# 12 차이 : 5개
# N 차이 : N/최소공배수 - 1

for i in diffs:
    result += i//diff_lcm - 1

print(result)