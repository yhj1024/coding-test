function solution(s) {
    const map = new Map();
    const result = []
    for(let i=0; i<s.length; i++) {
        if(map.has(s[i])) {
          const index = map.get(s[i]);
          result.push(i - index);
        } else {
          result.push(-1);
        }
        map.set(s[i], i);
    }
    return result
}
