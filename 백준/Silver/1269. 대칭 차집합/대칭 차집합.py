import sys


def solution():
    sys.stdin.readline()
    A = set(map(int, sys.stdin.readline().strip().split()))
    B = set(map(int, sys.stdin.readline().strip().split()))
    print(len(A-B) + len(B-A))


if __name__ == '__main__':
    solution()
