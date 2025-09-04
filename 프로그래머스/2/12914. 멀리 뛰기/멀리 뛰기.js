function solution(n) {
    const memo = {};
    
    const dfs = (target) => {
        if(target === 1) return 1;
        if(target === 2) return 2;
        if(memo[target]) return memo[target];
        
        memo[target] = (dfs(target - 1) + dfs(target - 2)) % 1234567;
        return memo[target];
    }
    
    return dfs(n);
}
