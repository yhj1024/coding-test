const dx = [-1, 1, 0, 0];
const dy = [0, 0, 1, -1];

function solution(maps) {
    const n = maps.length;
    const m = maps[0].length;
    const queue = [{x: 0, y: 0, distance: 1}];
    const visited = maps.map(row => row.map(() => false));
    visited[0][0] = true;
    while(queue.length) {
        const {x,y,distance} = queue.shift();
        if(x === n-1 && y === m-1) {
            return distance;
        }
        for(let i=0; i<4; i++) {
            const nx = x + dx[i];
            const ny = y + dy[i];
            if(nx < 0 || ny < 0) continue;
            if(nx >= n || ny >= m) continue;
            if(maps[nx][ny] === 0) continue;
            if(visited[nx][ny]) continue;
            visited[nx][ny] = true;
            queue.push({
                x: nx,
                y: ny,
                distance: distance + 1
            })
        }
    }
    return -1;
}