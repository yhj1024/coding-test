#
while True:
    points = list(map(int, input().split()))

    if points[0] == points[1] == points[2] == 0:
        break

    points.sort()

    # 가장 긴 변의 길이가 나머지 변의 합이 길이보다 짧은 경우 Invalid
    if points[0] + points[1] <= points[2] :
        print('Invalid')
    # 세 변의 길이가 모두 동일한 경우 Equilateral
    elif points[0] == points[1] == points[2]:
        print('Equilateral')
    # 세 변의 길이가 모두 다른 경우 Scalene
    elif points[0] != points[1] and points[1] != points[2] and points[0] != points[2]:
        print('Scalene')
    # 두 변의 길이만 같은 경우 Isosceles
    else:
        print('Isosceles')
