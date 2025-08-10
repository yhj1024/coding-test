function solution(k, tangerine) {
    const sums = [];
    let sumTotal = 0;
    let answer = 0;
    tangerine.forEach(tar => {
        sums[tar] = (sums[tar] || 0) + 1
    })
    sums.sort((a,b) => b-a);
    for(let i=0; i<sums.length; i++) {
        if(sumTotal >= k) {
            break;
        }
        answer += 1;
        sumTotal += sums[i]
    }
    return answer;
}