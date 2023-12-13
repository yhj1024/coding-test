count = int(input())
words = [""] * count
for _ in range(count):
    wordArr = list(input())
    print(wordArr[0] + wordArr[-1])