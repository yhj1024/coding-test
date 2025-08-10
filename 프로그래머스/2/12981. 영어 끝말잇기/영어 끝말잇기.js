function solution(n, words) {
    const set = new Set();
    const gamers = [];
    for(let i=0; i<words.length; i++) {
        const nowGamer = i % n;
        if(i === 0) {
            set.add(words[i])
            gamers[nowGamer] ? gamers[nowGamer] += 1 : gamers[nowGamer] = 1;
            continue;
        }
        const beforeLastWord = words[i-1][words[i-1].length - 1];
        const nowLastWord = words[i][0];
        if((i>0 && beforeLastWord !== nowLastWord)) {
            return [nowGamer + 1, (gamers[nowGamer] ?? 0) + 1]            
        }
        if(set.has(words[i])) {
            return [nowGamer + 1, (gamers[nowGamer] ?? 0) + 1]
        }
        set.add(words[i])
        gamers[nowGamer] ? gamers[nowGamer] += 1 : gamers[nowGamer] = 1;
    }
    
    // 단어 Set
    // 현재 순번당 진행 숫자 배열
    // 단어들을 반복 시작
    // 단어 Set에 현재 단어가 있는 경우
    // 리턴 [해당 플레이어 + 해당 플레이어의 배열 + 1]

    return [0, 0];
}