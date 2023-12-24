import sys

# 유클리드 호제법
# 최대 공약수 구하기
# 10 15 가 있다고 하면
# X=10, Y=15 를 대입한다
# 이 때 10 / 15 를 했을때 나머지 (R)은 10이 된다.
# R이 0이 될 때 까지 X에는 Y값을 대입 Y에는 R을 대입하여 R이 0이 될 때까지 반복한다
# X=15 Y=10 15 % 10 = 5
# X=10 Y=5 10 % 5 = 0, 즉 Y는 5가되며 최대공약수 5를 구할 수 있다

# 그리고 최대공배수는
# 두 자연수의 곱 / 최대공약수로 계산할 수 있다

def get_grt_com_div(x, y):
    while True:
        r = x % y
        if r == 0:
            break
        x = y
        y = r
    return y


def get_lst_com_mul(x,y):
    grt_com_div = get_grt_com_div(x, y)
    return int(x*y/grt_com_div)


A, B = map(int, sys.stdin.readline().split())
print(get_lst_com_mul(A, B))

# result = B
# 시간 초과 단순히 큰 값 기준부터 1씩 늘려가면서 계산 시 실패
# while True:
#     if result % A == 0 and result % B == 0:
#         print(result)
#         break
#     else:
#         result += 1

