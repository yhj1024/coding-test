n = int(input())
enters = set()
for _ in range(n):
    name, gubun = input().split()
    if gubun == 'enter':
        enters.add(name)
    else:
        enters.remove(name)

sorted_enters = sorted(enters, reverse=True)
print(*sorted_enters, sep='\n')