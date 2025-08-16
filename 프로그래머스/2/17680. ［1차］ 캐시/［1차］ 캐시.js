class LRUCacheSet {
    constructor(maxSize) {
        this.maxSize = maxSize;
        this.cache = new Set();
    }
    
    get(key) {
        if (this.cache.has(key)) {
            this.cache.delete(key);
            this.cache.add(key);
            return true;
        }
        return false;
    }
    
    add(key) {
        if (this.cache.has(key)) {
            this.cache.delete(key);
            this.cache.add(key);
        } else {
            if (this.cache.size >= this.maxSize) {
                const firstKey = this.cache.values().next().value;
                this.cache.delete(firstKey);
            }
            this.cache.add(key);
        }
    }
}

function solution(cacheSize, cities) {
    if (cacheSize === 0) return cities.length * 5;
    
    let result = 0;
    const cache = new LRUCacheSet(cacheSize);
    
    for (const city of cities) {
        const lowerCity = city.toLowerCase();
        if (cache.get(lowerCity)) {
            result += 1;
        } else {
            cache.add(lowerCity);
            result += 5;
        }
    }
    
    return result;
}
