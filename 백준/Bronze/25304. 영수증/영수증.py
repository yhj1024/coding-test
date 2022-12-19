sum = int(input());
cnt = int(input());
sum2 = 0;

for i in range(cnt) :
  price, cost = map(int, input().split());
  sum2 += price * cost;

print('Yes 'if sum == sum2 else 'No');