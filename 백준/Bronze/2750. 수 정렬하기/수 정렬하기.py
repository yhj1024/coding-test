N = int(input())
nums = []

for i in range(1, N+1):
    nums.append(int(input()))

nums.sort()

for i in nums:
    print(i)