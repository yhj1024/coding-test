const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

class MinHeap {
    constructor() {
        this.heap = [null]; // 인덱스 1부터 시작
    }
    
    push(value) {
        this.heap.push(value);
        let current = this.heap.length - 1;
        let parent = Math.floor(current / 2);
        
        while (parent !== 0 && this.heap[parent] > this.heap[current]) {
            [this.heap[parent], this.heap[current]] = [this.heap[current], this.heap[parent]];
            current = parent;
            parent = Math.floor(current / 2);
        }
    }
    
    pop() {
        if (this.heap.length === 1) return null;
        if (this.heap.length === 2) return this.heap.pop();
        
        const min = this.heap[1];
        this.heap[1] = this.heap.pop();
        
        let current = 1;
        let left = 2;
        let right = 3;
        
        while (this.heap[left]) {
            let smaller = left;
            if (this.heap[right] && this.heap[right] < this.heap[left]) {
                smaller = right;
            }
            
            if (this.heap[current] > this.heap[smaller]) {
                [this.heap[current], this.heap[smaller]] = [this.heap[smaller], this.heap[current]];
                current = smaller;
                left = current * 2;
                right = current * 2 + 1;
            } else {
                break;
            }
        }
        
        return min;
    }
    
    size() {
        return this.heap.length - 1;
    }
}

const n = parseInt(input[0]);

if (n === 1) {
    console.log(0);
} else {
    const heap = new MinHeap();
    
    for (let i = 1; i <= n; i++) {
        heap.push(parseInt(input[i]));
    }
    
    let totalCost = 0;
    
    while (heap.size() > 1) {
        const first = heap.pop();
        const second = heap.pop();
        const sum = first + second;
        
        totalCost += sum;
        heap.push(sum);
    }
    
    console.log(totalCost);
}