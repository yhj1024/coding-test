class LRUCache {
    constructor(maxSize) {
        this.maxSize = maxSize;
        this.cache = new Map();
    }
    
    get(key) {
        if (this.cache.has(key)) {
            const value = this.cache.get(key);
            this.cache.delete(key);
            this.cache.set(key, value);
            return true;
        }
        return false;
    }
    
    set(key) {
        if (this.cache.has(key)) {
            this.cache.delete(key);
        } else if (this.cache.size >= this.maxSize) {
            const firstKey = this.cache.keys().next().value;
            this.cache.delete(firstKey);
        }
        this.cache.set(key, true);
    }
}

function solution(cacheSize, cities) {
    if (cacheSize === 0) return cities.length * 5;
    
    let result = 0;
    const cache = new LRUCache(cacheSize);
    
    for (const city of cities) {
        const lowerCity = city.toLowerCase();
        if (cache.get(lowerCity)) {
            result += 1;
        } else {
            cache.set(lowerCity);
            result += 5;
        }
    }
    
    return result;
}
