count = int(input())
words = [""] * count
for i in range(0, count):
    words[i] = input()

for word in words:
    wordArr = list(word)
    print(wordArr[0] + wordArr[len(wordArr)-1])
