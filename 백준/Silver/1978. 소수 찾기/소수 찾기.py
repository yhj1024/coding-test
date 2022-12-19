numCnt = int(input());
nums = map(int, input().split());
evenCnt = 0;

for num in nums : 
  if num == 1 : 
    evenCnt += 1
  for i in range(2,num) :
    if num % i == 0 :
      evenCnt += 1;
      break;

print(numCnt - evenCnt);
