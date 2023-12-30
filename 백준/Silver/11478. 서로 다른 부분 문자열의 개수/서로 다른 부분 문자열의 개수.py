import sys


def solution():
    answer = set()
    words = sys.stdin.readline().strip()
    for i in range(len(words)):
        for j in range(len(words)-i):
            answer.add(str(words[j:i+1+j]))
    print(len(answer))


if __name__ == '__main__':
    solution()

