N, B = input().split()
# 진법수
B = int(B)
# 몫이 저장될 변수
division = int(N)
# 결과 값이 저장될 변수
result = ''

def getRemainder(value):
    if value < 10:
        return str(value)
    else:
        # 10 부터 A임
        return chr(ord('A') + value - 10)

while division > 0:
    # 나머지 구하기
    result = getRemainder(division % B) + result
    # 몫 구하기
    division //= B

# 진법 수로 나누고 몫을 몫이 저장된 변수에 재할당
# 나머지를 result 에 합산함
# 몫이 0인 경우에는 종료하고 result 를 프린트하여 보여줌

print(result)
