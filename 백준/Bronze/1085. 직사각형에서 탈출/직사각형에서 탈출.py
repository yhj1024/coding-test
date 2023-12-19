x,y,w,h = map(int, input().split())
distances = [x, abs(x-w), y, abs(y-h)]
print(min(distances))