import sys


def solution():

    N, M = map(int, sys.stdin.readline().split())
    not_heards = set()
    result = []

    for _ in range(N):
        not_heards.add(sys.stdin.readline().strip())

    for _ in range(0, M):
            name = sys.stdin.readline().strip()
            if name in not_heards:
                result.append(name)
    result.sort()
    print(len(result))
    for name in result:
        print(name)


if __name__ == '__main__':
    solution()
