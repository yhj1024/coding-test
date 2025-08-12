function solution(x, n) {
    const answer = [x]
    for(let i=1; i<n; i++) {
        const lastAnswer = answer[answer.length - 1];
        answer.push(lastAnswer + x);
    }
    return answer;
}