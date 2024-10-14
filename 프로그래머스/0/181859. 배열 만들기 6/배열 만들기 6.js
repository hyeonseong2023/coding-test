function solution(arr) {
    var stk = [];
    
    for (var item of arr) stk[stk.length - 1] === item ? stk.pop() : stk.push(item);
    
    return stk.length ? stk : [-1];
}