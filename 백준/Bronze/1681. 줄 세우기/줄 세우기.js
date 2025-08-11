const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const [s,l] = input[0].split(' ').map(Number)
const solution = () => {
    let result = 0;
    let now = 1;
    for(let i = 1; i <= s; i++) {
        while(now.toString().includes(l.toString())) {
            now++;
        }
        result = now;
        now++;
    }
    return result;
}
console.log(solution(s,l))
