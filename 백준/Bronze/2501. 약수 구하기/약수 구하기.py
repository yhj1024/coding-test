N, K = map(int, input().split())
# 몇번째 약수가 나왔는지 할당할 변수
cur_div_idx = 0
# 출력할 N번째 약수의 실제 값
result = 0
for i in range(1, N+1):
    if N % i == 0:
        cur_div_idx += 1
    if K == cur_div_idx:
        result = i
        break

print(result)
