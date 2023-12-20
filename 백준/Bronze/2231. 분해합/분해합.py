N = int(input())
result = 0
for i in range(1, N + 1):
    num_array = list(str(i))
    decomposition_sum = sum(map(int, num_array))
    if N == decomposition_sum + i:
        result = i
        break
print(result)