a,b,c = map(int, input().split());

result = 0;

if a != b and b != c and a != c : 
  max = a;
  if max < b :
    max = b;
  if max < c :
    max = c
  result = max*100;
  
elif a == b and b == c and a == c :
  result = 10000+(a*1000)
else :
  if a == b :
    result = 1000+(a*100);
  else :
    result = 1000+(c*100);

print(result);