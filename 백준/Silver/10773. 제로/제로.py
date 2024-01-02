import sys


def solution():
    stack = []
    K = int(sys.stdin.readline())
    for _ in range(K):
        num = int(sys.stdin.readline())
        if num == 0:
            stack.pop(-1)
        else:
            stack.append(num)
    print(sum(stack))
    return 0


if __name__ == '__main__':
    solution()