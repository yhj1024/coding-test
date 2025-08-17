const fs = require('fs');

let rawInput;
if (fs.existsSync('./input.txt')) {
    // 로컬
    rawInput = fs.readFileSync('./input.txt', 'utf8').trim().split('\n');
} else {
    // 백준
    rawInput = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
}
const m = rawInput[0]
const n = rawInput[1]

const solution = (m,n) => {
    const result = []
    for(let i=m; i<=n; i++) {
        const val = Math.floor(Math.sqrt(i))
        if(i === Math.pow(val, 2)) {
            result.push(i)
        }
    }
    if(result.length) {
        console.log(result.reduce((prev,curr) => prev+curr, 0));
        console.log(result[0]);
    } else {
        console.log(-1);
    }
}

solution(parseInt(m), parseInt(n));