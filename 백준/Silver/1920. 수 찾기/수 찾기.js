const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const solution = () => {
    const set = new Set();
    const targets = input[1].split(' ').map(Number);
    const numbers = input[3].split(' ').map(Number);
    for(const t of targets) {
        set.add(t);
    }
    for(const n of numbers) {
        if(set.has(n)) {
            console.log(1);
        } else {
            console.log(0);
        }

    }
}

solution();
