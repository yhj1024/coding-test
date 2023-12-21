N, M = map(int, input().split())
# 보드 전체
board = []
# 최소 색칠 값 (8*8이므로 최대 색칠은 32칸)
min_count = 32

# 8 * 8 보드 판에서 조건을 만족하는 값을 계산하여 최소값을 min_count 에 업데이트 처리해주는 함수
def min_count_updater(i, j):
    global min_count
    
    # 검정색으로 시작하는 경우에 대한 색칠 카운트
    count_start_black = 0
    for k in range(i, i+8):
        for l in range(j, j+8):
            if (k+l) % 2 == 0 and board[k][l] == 'W':
                count_start_black += 1
            elif (k+l) % 2 == 1 and board[k][l] == 'B':
                count_start_black += 1
    if min_count > count_start_black:
        min_count = count_start_black

    # 흰색으로 시작하는 경우에 대한 색칠 카운트
    count_start_white = 0
    for k in range(i, i+8):
        for l in range(j, j+8):
            if (k+l) % 2 == 0 and board[k][l] == 'B':
                count_start_white += 1
            elif (k+l) % 2 == 1 and board[k][l] == 'W':
                count_start_white += 1

    if min_count > count_start_white:
        min_count = count_start_white


# 보드 전체를 입력받는다
for i in range(N):
    line = list(input())
    board.append(line)

# 8*8 구간이 나오는 모든 시작 인덱스를 계산 함수로 넘겨준다
for i in range(N-7):
    for j in range(M-7):
        min_count_updater(i, j)

# min_count 출력 처리
print(min_count)