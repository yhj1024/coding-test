function solution(t, p) {
    var answer = 0;
    const len = p.length
    for(let i=0; i<t.length; i++) {
        const numStr = t.substr(i, p.length);
        if(numStr.length < p.length) {
            break;
        }
        if(Number(p) >= Number(numStr)) {
            answer = answer + 1;
        }
    }
    return answer;
}