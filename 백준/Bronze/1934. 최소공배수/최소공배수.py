import sys

T = int(sys.stdin.readline())


def gcd(a, b):
    # 최대공약수 구하기
    while a % b != 0:
        tmp = b
        b = a % b
        a = tmp
    return b


def lcm(A, B):
    # 최소공배수는 두수의 곱 / 최대공약수
    return A * B / gcd(A, B)


def solution():
    for _ in range(T):
        A, B = map(int, sys.stdin.readline().split())
        print(int(lcm(A,B)))


solution()