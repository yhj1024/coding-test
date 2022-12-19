intArr = [];
fir = 31;
sec = 31;

for i in range(30) :
  intArr.append(0);

for i in range(28) :
  intArr[int(input())-1] = 1;

for (i, v) in enumerate(intArr) :
  if v == 0 :
      if i+1 < fir :
        sec = fir;
        fir = i+1;
      else :
        sec = i+1;

print(fir);
print(sec);