import sys

A1, B1 = map(int, sys.stdin.readline().split())
A2, B2 = map(int, sys.stdin.readline().split())


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
    B = lcm(B1, B2)
    A = A1 * B / B1 + A2 * B / B2
    # 약분 처리 필요
    k = gcd(A, B)
    if k > 1:
        print(int(A/k), int(B/k))
    else:
        print(int(A), int(B))


solution()