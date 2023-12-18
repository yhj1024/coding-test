while True:
    N = int(input())
    if N == -1:
        break
    # 약수 값이 담길 배열
    L = []
    # 약수 값의 합
    div_sum = 0
    for i in range(1, N):
        if N % i == 0:
            L.append(str(i))
            # 약수 값의 합
            div_sum += i
        # # 약수 값의 합이 현재 수를 초과하는 경우
        # if div_sum > N:
        #     print(str(N)+' is NOT perfect.')
        #     break
        # 마지막 순번이면서 약수 값의 합과 N이 같은 경우 (완전 수인 경우)
        if i == N - 1 and div_sum == N:
            print(str(N) + ' = ' + ' + '.join(map(str, L)))
        elif i == N - 1 and div_sum != N:
            print(str(N)+' is NOT perfect.')