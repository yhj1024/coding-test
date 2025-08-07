function solution(arr) {
    return arr.reduce((cur, prev) => cur + prev, 0) / arr.length;
}