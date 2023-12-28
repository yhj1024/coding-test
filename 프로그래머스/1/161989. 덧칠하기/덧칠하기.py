def solution(n, m, section):
    # 2,3,6이 칠해지지 않은 경우
    # 2를 칠하면서 2,3,4,5 까지 칠해버린다.
    # 다음 3을 보는데 이미 5까지 칠해졌으니 PASS
    # 6은 5보다 크니 다시 색칠

    answer = 0
    # 페인트를 칠한 구간
    painted_sec = -1
    
    # 덜 칠해진 영역을 반복
    for i in section:
        # 현재 칠해지지 않은 영역이, 최대 칠해진 영역보다 큰 경우
        if i > painted_sec:
            # 최대 칠할 수 있는 영역까지 칠하고
            painted_sec = i + m - 1
            # 1을 증가 시킴
            answer += 1

    return answer