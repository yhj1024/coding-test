function solution(food) {
    const left = [];
    for(let i=1; i<food.length; i++) {
        const t = Math.floor(food[i] / 2);
        for(let j=0; j<t; j++) {
            left.push(i)
        }
    }
    var answer = left.join('') + '0' + left.reverse().join('');
    return answer;
}