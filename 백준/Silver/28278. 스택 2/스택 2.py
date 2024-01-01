import sys

N = int(input())
stack = []
for _ in range(N):
    cmd = sys.stdin.readline().strip()
    if len(cmd) > 2:
        stack.append(int(cmd[2:]))
    elif cmd == '2':
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop())
    elif cmd == '3':
        print(len(stack))
    elif cmd == '4':
        if len(stack) == 0:
            print(1)
        else:
            print(0)
    elif cmd == '5':
        if len(stack)==0:
            print(-1)
        else:
            print(stack[-1])

