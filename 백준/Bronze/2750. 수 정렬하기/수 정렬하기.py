import sys
sys.setrecursionlimit(10**6)

N = int(sys.stdin.readline().strip())
result = []

for _ in range(N):
    result.append(int(sys.stdin.readline().strip()))


def swap(array, i, j):
    tmp = array[i]
    array[i] = array[j]
    array[j] = tmp

# 15, 22, 8, 13, 5, 10
def quick_sort(array, start, end):
    if start >= end:
        return

    pivot = start
    left = start + 1
    right = end

    while left <= right:
        # pivot 보다 작은 값을 찾을 때 까지 오른쪽으로 이동
        while left <= end and array[left] <= array[pivot]:
            left += 1
        # pivot 보다 큰 값을 찾을 때 까지 왼쪽으로 이동
        while right > start and array[right] >= array[pivot]:
            right -= 1
        # 교차 시 right와 pivot 값을 변경
        if left > right:
            swap(array, right, pivot)
        # 교차가 안된 경우 right 와 left 값 변경
        else :
            swap(array, left, right)

    quick_sort(array, right + 1, end)
    quick_sort(array, start, right - 1)


quick_sort(result, 0, len(result) - 1)
print(*result, sep='\n')