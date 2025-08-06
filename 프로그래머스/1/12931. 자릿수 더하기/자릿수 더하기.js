function solution(n) {
    return String(n).split('').reduce((cur,prev) => Number(cur)+Number(prev), 0);
}