import random
import sys



def merge_sort(arr, start, end):

    # 더 이상 나눌 수 없는 경우 재귀 종료하면서 1개 짜리 반환
    if start >= end:
        return arr

    # 중간 값을 기준으로 계속 쪼개면서 재귀호출
    # 최소 단위에서 return 문을 만나면서 종료되고 merge가 실행되면서
    # 최소 단위부터 다시 병합하며 정렬되는 방식으로 돌아감
    mid = (start+end)//2
    merge_sort(arr, start, mid)
    merge_sort(arr, mid+1, end)

    return merge(arr, start, end)


def merge(arr, start, end):

    tmp = []
    mid = (start+end)//2
    i = start
    j = mid + 1

    # i가 중간 인덱스를 넘어가거나, j가 마지막 인덱스를 넘어가면 반복 종료
    while i <= mid and j <= end:
        if arr[i] > arr[j]:
            tmp.append(arr[j])
            j += 1
        else:
            tmp.append(arr[i])
            i += 1
    # 왼쪽에 남은 값 정리 (i가 중간 인덱스를 넘어갈때까지)
    while i <= mid:
        tmp.append(arr[i])
        i += 1
    # 오른쪽에 남은 값 정리 (j가 마지막 인덱스를 넘어갈때까지)
    while j <= end:
        tmp.append(arr[j])
        j += 1

    # 현재 정렬된 구간의 arr을 tmp에 바꿔 넣어주기
    arr[start:end+1] = tmp
    return arr

if __name__ == '__main__':
    N = int(sys.stdin.readline().strip())
    t_arr = [int(sys.stdin.readline().strip()) for _ in range(N)]
    sorted_list = merge_sort(t_arr, 0, len(t_arr)-1)
    print(*sorted_list, sep='\n')