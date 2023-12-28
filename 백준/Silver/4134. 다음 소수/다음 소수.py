import sys


def solution():

    def is_prime(value):
        if value < 2:
            return False
        for i in range(2, int(value**0.5)+1):
            if value % i == 0:
                return False
        return True

    case_count = int(sys.stdin.readline())
    for _ in range(case_count):
        num = int(sys.stdin.readline())
        while not is_prime(num):
            num += 1
        print(num)


if __name__ == '__main__':
    solution()
