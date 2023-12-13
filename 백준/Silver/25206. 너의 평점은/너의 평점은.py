gradeTable = {
    'A+': 4.5,
    'A0': 4.0,
    'B+': 3.5,
    'B0': 3.0,
    'C+': 2.5,
    'C0': 2.0,
    'D+': 1.5,
    'D0': 1.0,
    'F': 0.0
}
majorGradeSum = 0.0
creditSum = 0.0

for i in range(1, 21):
    info = input().split()
    if info[2] == 'P':
        continue
    creditSum += float(info[1])
    majorGradeSum += float(info[1]) * float(gradeTable[info[2]])

print(majorGradeSum/creditSum)