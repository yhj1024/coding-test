a, b, c, d, e, f = map(int, input().split())
# 2 5 8 3 -4 -11

# ax + by = c
# dx + ey = f
#
# by = c - ax
# ey = f - dx
#
# y = c/b - ax/b
# y = f/e - dx/e
#
# c/b - ax/b = f/e - dx/e
#
# c - ax = bf/e - bdx/e
#
# ce - axe = bf - bdx
#
# ce - bf = axe - bdx
#
# ce - bf / (ae - bd) =  x

y = (c*d - f*a) / (d*b - e*a)
x = (c*e - b*f) / (a*e - b*d)

print(int(x), int(y))

