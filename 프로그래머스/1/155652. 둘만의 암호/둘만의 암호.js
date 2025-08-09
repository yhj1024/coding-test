function solution(s, skip, index) {
    let result = ''
    let alphaString = 'abcdefghijklmnopqrstuvwxyz'
    for(let i=0; i<skip.length; i++) {
        alphaString = alphaString.replace(skip[i], '')
    }
    const alphas = alphaString.split('')
    for(let i=0; i<s.length; i++) {
        const wordIndex = alphas.indexOf(s[i]);
        result += alphas[(wordIndex+index)%alphas.length]
    }
    return result;
}