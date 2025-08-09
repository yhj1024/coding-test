function solution(answers) {
    const supoja1 = [1,2,3,4,5];
    const supoja2 = [2,1,2,3,2,4,2,5];
    const supoja3 = [3,3,1,1,2,2,4,4,5,5];
    let scores = [0,0,0];
    const result = [];
    answers.forEach((answer, index) => {
        if(supoja1[index % supoja1.length] === answer) {
            scores[0] += 1;
        }
        if(supoja2[index % supoja2.length] === answer) {
            scores[1] += 1;
        }
        if(supoja3[index % supoja3.length] === answer) {
            scores[2] += 1;
        }
    })
    const highest = Math.max(scores[0], scores[1], scores[2]);
    scores.forEach((score, index) => {
        if(highest === score) result.push(index+1)
    })
    return result;
}