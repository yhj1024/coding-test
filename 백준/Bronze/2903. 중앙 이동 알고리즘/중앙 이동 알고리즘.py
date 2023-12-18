# 규칙 : 한 변의 점 개수 제곱을 구하면 됨
N = int(input())
doc_count = 2

# 1번 반복 시 이 전 점의 개수 x2 - 1을 해준다.
for _ in range(N):
    doc_count = doc_count * 2 -1

# 제곱하여 출력
print(doc_count**2)
