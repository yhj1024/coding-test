changes = [25, 10, 5, 1]

T = int(input())

for _ in range(T):
    C = int(input())
    for i in changes:
        count = C // i
        print(count, end=' ')
        C %= i
    print()