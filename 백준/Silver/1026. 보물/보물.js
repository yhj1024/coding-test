const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const solution = () => {
    const n = parseInt(input[0]);
    const aList = input[1].split(' ').map(Number);
    const bList = input[2].split(' ').map(Number);
    
    aList.sort((a, b) => a - b);
    bList.sort((a, b) => b - a);
    
    let sum = 0;
    for(let i = 0; i < n; i++) {
        sum += aList[i] * bList[i];
    }
    
    console.log(sum);
}

solution();