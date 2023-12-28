import sys


def solution():

    N = int(sys.stdin.readline())
    counts = [0] * 10001

    for _ in range(N):
        number = int(sys.stdin.readline())
        counts[number] += 1

    for index, i in enumerate(counts):
        while i != 0:
            print(index)
            i -= 1


if __name__ == '__main__':
    solution()
