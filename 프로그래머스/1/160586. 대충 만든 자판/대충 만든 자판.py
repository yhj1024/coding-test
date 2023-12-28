def solution(keymap, targets):
    answer = []
    # {A:-1, B:-1 ... , Z:?} 형태의 dict를      초기화하여 생성한다
    key_dict = {}
    
    for i in range(26):
        key_dict.update({
            chr(65+i): 101
        })
    
    # keymap 의 원소 들을 반복하면서
    # 해당 keymap 의 index가 기존 index보다 작은 경우 값 변경
    for key in keymap:
        chars = list(key)
        for index, char in enumerate(chars):
            val = key_dict[char]
            if index < val:
                key_dict[char] = index

    for target in targets:
        chars = list(target)
        sum = 0
        for char in chars:
            val = key_dict[char]
            if val != 101:
                sum += val + 1
            else:
                sum = -1
                break
        answer.append(sum)
    return answer