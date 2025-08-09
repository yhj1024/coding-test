function solution(answers) {
    const supoja1 = [1,2,3,4,5];
    const supoja2 = [2,1,2,3,2,4,2,5];
    const supoja3 = [3,3,1,1,2,2,4,4,5,5];
    let supoja1Score = 0;
    let supoja2Score = 0;
    let supoja3Score = 0;
    answers.forEach((answer, index) => {
        if(supoja1[index % supoja1.length] === answer) {
            supoja1Score += 1;
        }
        if(supoja2[index % supoja2.length] === answer) {
            supoja2Score += 1;
        }
        if(supoja3[index % supoja3.length] === answer) {
            supoja3Score += 1;
        }
    })
    const highest = Math.max(supoja1Score, supoja2Score, supoja3Score);
    const result = []
    if(highest === supoja1Score) {
        result.push(1)
    }
    if(highest === supoja2Score) {
        result.push(2)
    }
    if(highest === supoja3Score) {
        result.push(3)
    }
    return result;
}