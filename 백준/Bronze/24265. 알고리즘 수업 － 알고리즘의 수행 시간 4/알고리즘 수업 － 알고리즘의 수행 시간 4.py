# 1부터 입력 받은 값 -1 합하면 됨

def add_calculate(value):
    return sum(i for i in range(1, value+1))

print(add_calculate(int(input())-1))
print(2)


