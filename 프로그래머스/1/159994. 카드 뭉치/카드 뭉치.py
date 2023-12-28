def solution(cards1, cards2, goal):
    # idx1, idx2 를 따로 관리한다.
    index1 = 0
    index2 = 0

    for word in goal:
        # 초기화
        is_find = False

        if len(cards1) > index1 and word == cards1[index1]:
            is_find = True
            index1 += 1

        if not is_find:
            if len(cards2) > index2 and word == cards2[index2]:
                is_find = True
                index2 += 1

        if not is_find:
            return 'No'
    return 'Yes'