xs = []
ys = []

for _ in range(3):
    x, y = map(int, input().split())
    xs.append(x)
    ys.append(y)

for i in range(3):
    if xs.count(xs[i]) == 1:
        print(xs[i], end=' ')
        break

for i in range(3):
    if ys.count(ys[i]) == 1:
        print(ys[i])
        break