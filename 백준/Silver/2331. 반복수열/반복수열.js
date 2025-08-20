const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

const solution = () => {
    const A = parseInt(input[0]);
    const P = parseInt(input[1]);
    
    const visited = new Map();
    let num = A;
    let order = 0;
    
    while (!visited.has(num)) {
        visited.set(num, order++);
        let next = 0;
        let temp = num;
        while (temp > 0) {
            const digit = temp % 10;
            next += Math.pow(digit, P);
            temp = Math.floor(temp / 10);
        }
        num = next;
    }
    console.log(visited.get(num));
}

solution();
