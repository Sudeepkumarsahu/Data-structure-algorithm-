// momoization
function sqre(n){
    return n*n
}
// console.time()
// console.log(sqre(5));
// console.timeEnd()

function memoize(func){
    let cache = {}
    return function(...args)
    {
        let n= args[0]
        if(n in cache)
        {
            return cache[n]
        }
        else{
            let result = func(n)
            cache[n] = result
            return result
        }
    }
}

console.time()
let effiResult = memoize(sqre)
console.log(effiResult(5));
console.timeEnd()


console.time()
console.log(effiResult(5));
console.timeEnd()