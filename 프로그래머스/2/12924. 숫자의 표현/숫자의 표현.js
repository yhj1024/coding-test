function solution(n) {
    if(n === 0) return 0
    let count = 1;
    let left = 1;
    let right = 1;
    let sum = 1;
    while(left < n/2) {
        if(sum === n) {
            count += 1;
            sum -= left;
            left += 1;
        } else if(sum < n) {
            right += 1;
            sum += right;
        } else if(sum > n) {
            sum -= left;
            left += 1;
        }
    }
    return count;
}