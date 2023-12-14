board = []
WORD_LINE_COUNT = 5

for i in range(WORD_LINE_COUNT):
    rows = list(input())
    board.append(rows)

for i in range(15):
    for j in range(5):
        if len(board[j]) >= i+1:
            print(board[j][i], end='')