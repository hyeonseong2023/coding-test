function solution(arr, query) {
    query.forEach((e, i) => arr = i % 2 === 0 ? arr.slice(0, e + 1) : arr.slice(e))
    return arr;
}