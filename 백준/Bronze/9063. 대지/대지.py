N = int(input())
x_max = -10001
x_min = 10001
y_max = -10001
y_min = 10001

for i in range(N):
    x, y = map(int, input().split())
    if x > x_max:
        x_max = x
    if x < x_min:
        x_min = x
    if y > y_max:
        y_max = y
    if y< y_min:
        y_min = y

print((x_max - x_min) * (y_max - y_min))