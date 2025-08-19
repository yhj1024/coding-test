function solution(maps) {
    const n = maps.length;
    const m = maps[0].length;
    const visited = Array(n).fill(null).map(() => Array(m).fill(false));
    visited[0][0] = true;
    const dx = [-1, 1, 0, 0];
    const dy = [0, 0, -1, 1];
    const queue = [{x: 0,y: 0, distance: 1}];
    while(queue.length) {
        const { x, y, distance } = queue.shift();
        if(x === maps.length -1 && y === maps[0].length - 1) {
            return distance;
        }
        // 상하좌우 방문처리
        for(let i=0; i<4; i++) {
            const nx = x + dx[i];
            const ny = y + dy[i];
            if(nx < 0 || ny < 0) continue;
            if(nx >= n || ny >= m) continue;
            if(visited[nx][ny]) continue;
            if(maps[nx][ny] === 0) continue;
            visited[nx][ny] = true;
            queue.push({x: nx, y: ny, distance: distance+1});
        }
    }
    return -1;
}