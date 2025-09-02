function getRank(count) {
    if(count === 6) return 1
    if(count === 5) return 2
    if(count === 4) return 3
    if(count === 3) return 4
    if(count === 2) return 5
    return 6
}

function solution(lottos, win_nums) {
    var answer = [];
    let sameCount = 0;
    let zeroCount = 0;
    for(let i=0; i<lottos.length; i++) {
        for(let j=0; j<win_nums.length; j++) {
            if(lottos[i] === win_nums[j]) {
                sameCount += 1;
                break;
            } else if (lottos[i] === 0){
                zeroCount += 1;
                break;
            }
        }
    }
    return [getRank(sameCount + zeroCount), getRank(sameCount)];
}