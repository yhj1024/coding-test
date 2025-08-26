function solution(a, b, n) {
    var answer = 0;
    while(n >= a) {
        const exChange = Math.floor(n/a) * b
        answer += exChange
        n = n%a + exChange
    }
    return answer;
}
