graphArr = [];
resultX = 0;
resultY = 0;
resultMAX = -1;

for i in range(9) :
  rowArr = input().split();
  graphArr.append(rowArr);

for (outerIdx, graph) in enumerate(graphArr) :
  for (innerIdx, stringNum) in enumerate(graph) :
    intNum = int(stringNum)
    if intNum > resultMAX :
      resultMAX = intNum;
      resultX = outerIdx;
      resultY = innerIdx;

print(resultMAX);
print(resultX+1, resultY+1, sep=' ');