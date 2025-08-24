function solution(s) {
    ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'].forEach((item, index)=> {
        s = s.replaceAll(item, index);
    })
    return parseInt(s, 10);
}