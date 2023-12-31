import sys

""" 
    에라토스테네스의 체
    
    특정 구간의 모든 소수를 빠르게 구하기 위한 알고리즘
    시간복잡도는 O(NloglogN)
    지워지지 않은 수는 소수로 판단하고 해당 수의 배수를 모두 제거하는 방식으로 구함
    지워지지 않은 수중 가장 작은 수는 2 부터 시작
    2는 소수로 판단하고 2의 배수인 4,6,8 ... 을 모두 제거
    3도 지워지지 않았으니 소수로 판단하고 6,9,12,15 를 모두 제거
    4는 지워졌으니 소수가 아님
    5도 지워지지 않았으니 소수로 판단하고 10,15,20 모두 제거하여
    소수만 남기는 방법
"""

def solution():
    max = 246912
    primes = [False] + [True] * (max - 1)
    for i in range(1, max):
        if primes[i]:
            for j in range(i*2+1, len(primes), i+1):
                primes[j] = False
    while True:
        result = 0
        n = int(sys.stdin.readline())
        if n == 0:
            break
        m = n * 2
        for i in range(n, m):
            if primes[i]:
                result += 1
        print(result)

if __name__ == '__main__':
    solution()