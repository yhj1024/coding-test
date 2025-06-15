function solution(k, score) {
    const result = [];
    const scores = [];
    
    for (let i of score) {
        scores.push(i);
        scores.sort((a,b) => b-a);
        if(scores.length > k)
            scores.pop();
        result.push(scores[scores.length-1])
    }
    console.log(result)
    return result
}