while True:
    N = int(input())
    if N == -1:
        break
    # 약수 값이 담길 배열
    L = [i for i in range(1, N) if N % i == 0]

    if sum(L) == N:
        print(f"{N} = {' + '.join(map(str, L))}")
    else:
        print(f"{N} is NOT perfect.")