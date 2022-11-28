changeTypes = [500,100,50,10,5,1];
change = 1000 - int(input());
result = 0;

for changeType in changeTypes : 
  if change == 0 :
    break;
  result += change // changeType;
  change %= changeType;

print(result);