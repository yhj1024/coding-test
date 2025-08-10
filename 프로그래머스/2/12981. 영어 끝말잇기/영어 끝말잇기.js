function solution(n, words) {
    const set = new Set();
    const gamers = [1];
    set.add(words[0])
    for(let i=1; i<words.length; i++) {
        const nowGamer = i % n;
        const beforeLastWord = words[i-1][words[i-1].length - 1];
        const nowLastWord = words[i][0];
        if(set.has(words[i]) || beforeLastWord !== nowLastWord) {
            return [nowGamer + 1, (gamers[nowGamer] ?? 0) + 1]
        }
        set.add(words[i])
        gamers[nowGamer] ? gamers[nowGamer] += 1 : gamers[nowGamer] = 1;
    }
    return [0, 0];
}