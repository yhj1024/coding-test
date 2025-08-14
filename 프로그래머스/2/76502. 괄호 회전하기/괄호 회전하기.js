function check(s) {
    const stack = [];
    return 1;
}

function solution(s) {
    var answer = 0;
    
    for(let i=0; i<s.length; i++) {
        const nextS = s.substring(0, i) + s.substring(i, s.length);
        console.log(nextS)
        answer += check(nextS);
    }
    
    return answer;
}