n, k = map(int, input().split());
target = list(map(int,input()));
result = [];

maxValue = 0; # 현재 조죄 중인 가장 큰 값
maxIndex = 0; # 현재 조회 중인 가장 큰 값의 index
nowIndex = 0; # 현재 조회 중인 Index
resultLastIndex = 1; # 결과에 마지막 Index
count = 0;

# 맨 앞 자리를 먼저 최대 값으로 맞춰놓는다
for i in range(k+1) :
  if target[i] == 9 :
    maxIndex = i;
    break; 
  if maxValue < target[i] :
    maxValue = target[i]
    maxIndex = i;

for i in reversed(range(maxIndex)) :
  del target[i];
  count += 1;

for i in range(len(target)) :
  if count == k :
    for j in range(i,len(target)) :
      result.append(target[j]);
    break;
  if i==0 : 
    result.append(target[i]);
  else :
    while True :
      if count == k : break;
      if result[-1] < target[i] :
        result.pop();
        count+=1;
      else :
        break;
    result.append(target[i]);

if k - count > 0 :
  for i in range(k - count) :
    del result[-1];

for i in result :
  print(i, end='')


