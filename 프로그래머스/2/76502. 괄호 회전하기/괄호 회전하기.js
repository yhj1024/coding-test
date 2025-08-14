function check(s) {
    const first = s.shift();
    if(first === ']' || first === '}' || first === ')') return 0
    const stack = [first];
    while(s.length) {
        const word = s.shift();
        if(word === '(' || word === '{' || word === '[') {
            stack.push(word);
            continue;
        }  
        const pop = stack.pop();
        if(pop === '(' && word !== ')') {
            return 0
        }
        if(pop === '{' && word !== '}') {
            return 0
        }
        if(pop === '[' && word !== ']') {
            return 0
        }
    }
    return stack.length > 0 ? 0 : 1;
}

function solution(s) {
    let arr = s.split('');
    let answer = 0;
    for(let i=0; i<s.length; i++) {
        answer += check([...arr]);
        arr.push(arr.shift());
    }
    return answer;
}