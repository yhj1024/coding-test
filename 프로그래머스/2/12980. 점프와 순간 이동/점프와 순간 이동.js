function solution(n) {
    // 뒤에서 부터 출발
    // 반씩 계속 나눔 홀수인 경우 -1 하고 체력 1 사용
    let result = 0;
    while(n > 0) {
        if(n % 2 === 0) {
            n /= 2
        } else {
            n -= 1;
            result += 1;
        }
    }
    return result
}

