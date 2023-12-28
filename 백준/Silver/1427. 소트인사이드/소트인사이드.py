import sys


def solution():

    nums = []
    strs = list(sys.stdin.readline().strip())
    for str in strs:
        nums.append(int(str))

    nums.sort(reverse=True)
    print(*nums, sep='')

if __name__ == '__main__':
    solution()
