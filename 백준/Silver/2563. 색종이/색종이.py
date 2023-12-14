size = 0
papers = []
# 가로 세로 100 도화지 준비
for i in range(100):
    rows = [0] * 100
    papers.append(rows)

# 검정색 종이 개수 입력 받기
black_paper_count = int(input())

# 좌표를 입력받고
for i in range(black_paper_count):
    coordinate = list(map(int, input().split()))
    for j in range(coordinate[0], coordinate[0]+10):
        for k in range(coordinate[1], coordinate[1]+10):
            papers[k][j] = 1

for paper in papers:
    for i in paper:
        if i == 1:
            size += 1

# for paper in papers:
#    print(paper)
    
print(size)