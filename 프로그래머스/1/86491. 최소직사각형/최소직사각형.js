function solution(sizes) {
    let maxW = 0;
    let maxH = 0;
    for(const [w,h] of sizes) {
        // 회전이 가능하니 큰 값을 한쪽으로 몰아서 계산
        if(maxW < Math.max(w,h)) maxW = Math.max(w,h)
        if(maxH < Math.min(w,h)) maxH = Math.min(w,h)
    }
    return maxW * maxH
}