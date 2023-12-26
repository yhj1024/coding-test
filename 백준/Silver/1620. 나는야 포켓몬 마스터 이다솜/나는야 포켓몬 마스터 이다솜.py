import sys

N, M = map(int, sys.stdin.readline().strip().split())

pocket_mons_array = list(sys.stdin.readline().strip() for _ in range(N))
pocket_mons_dict = dict()

for idx, val in enumerate(pocket_mons_array):
    pocket_mons_dict.update({val: idx})

q = list(sys.stdin.readline().strip() for _ in range(M))

for i in q:
    if i.isalpha():
        print(int(pocket_mons_dict.get(i))+1)
    else:
        print(pocket_mons_array[int(i)-1])

