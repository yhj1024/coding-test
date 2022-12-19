n = int(input());
intArr = [];

# for i in range(n) :
#   intArr.push()

intArr = map(int, input().split());
findVal = int(input());
result = 0;

for i in intArr :
  if i == findVal :
    result += 1;


print(result);

