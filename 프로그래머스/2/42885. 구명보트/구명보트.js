function solution(people, limit) {
    let answer = 0;
    people.sort((a,b) => a-b)
    let left = 0;
    let right = people.length - 1;
    while(left <= right) {
      answer += 1;
      const sum = people[left] + people[right];
      if(sum <= limit) {
        left += 1;
        right -= 1; 
      } else {
        right -= 1; 
      }
    }
    return answer;
}