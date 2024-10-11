function solution(arr, queries) {
    queries.forEach((value,index) => {
        [arr[queries[index][0]], arr[queries[index][1]]] = [arr[queries[index][1]], arr[queries[index][0]]];
    });
    
    return arr;
}