xs = []
ys = []
result = []
for _ in range(3):
    x, y = map(int, input().split())
    xs.append(x)
    ys.append(y)
# 첫번째랑 두번째랑 똑같으면 세번째꺼 출력
# 첫번째랑 세번째랑 똑같으면 두번째꺼 출력
# 두번째랑 세번째랑 똑같으면 첫번째꺼 출력
if xs[0] == xs[1]:
    result.append(xs[2])
elif xs[0] == xs[2]:
    result.append(xs[1])
else:
    result.append(xs[0])

if ys[0] == ys[1]:
    result.append(ys[2])
elif ys[0] == ys[2]:
    result.append(ys[1])
else:
    result.append(ys[0])

print(*result)