const DIRECTION = {
    U: [-1, 0],
    D: [1, 0],
    R: [0, 1],
    L: [0, -1]
}

function solution(dirs) {
    
    const set = new Set();
    let result = 0;
    let x = 5;
    let y = 5;
    
    for(let i=0; i<dirs.length; i++) {
        
        const [dx, dy] = DIRECTION[dirs[i]];
        const nx = x + dx;
        const ny = y + dy;
        
        if(nx < 0 || ny < 0 || nx > 10 || ny > 10) continue;
        
        const path1 = x + ',' + y + '-' + nx + ',' + ny;
        const path2 = nx + ',' + ny + '-' + x + ',' + y;
              
        x = nx;
        y = ny;

        if(set.has(path1)) continue;
        
        set.add(path1);
        set.add(path2);

        result += 1;
        
    }
        
    return result;
    
}
