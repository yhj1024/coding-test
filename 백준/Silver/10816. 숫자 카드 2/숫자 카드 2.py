import collections
import sys

N = int(sys.stdin.readline().strip())
cards = list(map(int, sys.stdin.readline().strip().split()))

M = int(sys.stdin.readline().strip())
target_cards = list(map(int, sys.stdin.readline().strip().split()))

target_card_dict = collections.OrderedDict.fromkeys(target_cards, 0)

for i in cards:
    if i in target_card_dict:
        target_card_dict[i] += 1

for i in target_cards:
    print(target_card_dict[i], end=' ')