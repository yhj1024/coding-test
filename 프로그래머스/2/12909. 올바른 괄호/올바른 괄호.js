function solution(s){
    if(s[0] === ')') return false
    let count = 1
    for(let i=1; i<s.length; i++) {
        if(s[i] === '(') {
            count += 1;
        } else {
            count -= 1;
        }
        if(count < 0) return false
    }
    return count === 0;
}