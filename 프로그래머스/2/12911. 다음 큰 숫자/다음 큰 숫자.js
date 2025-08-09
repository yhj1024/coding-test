function solution(n) {
  let next = n + 1
  const nowIncludeOne = n.toString(2).split('1').length - 1
  while(next.toString(2).split('1').length - 1 !== nowIncludeOne) {
      next += 1;
  }
  return next
}
