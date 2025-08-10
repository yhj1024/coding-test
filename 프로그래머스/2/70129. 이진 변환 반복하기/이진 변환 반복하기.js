function solution(s) {
    let zeroCount = 0;
    let repeatCount = 0;
    while(s !== '1') {
        repeatCount += 1;
        zeroCount += s.split('0').length - 1;
        s = s.replaceAll('0', '').length.toString(2);
    }
    return [repeatCount, zeroCount]
}