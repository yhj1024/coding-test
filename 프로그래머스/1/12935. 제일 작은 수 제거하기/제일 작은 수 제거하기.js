function solution(arr) {
    const min = Math.min(...arr);
    const newArr = arr.filter(item => item !== min);
    return newArr.length > 0 ? newArr : [-1]
}