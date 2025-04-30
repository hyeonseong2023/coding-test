function solution(left, right) {
    let answer = 0;    
    
    for (let j = left; j <= right; j++) {
        let divisors = new Set();
        for (let i = 1; i <= Math.sqrt(j); i++) {
            if (j % i === 0) {
                divisors.add(i);
                divisors.add(j / i);
            }
        }
        answer = divisors.size % 2 === 0 ? answer + j : answer - j;
    }
    
    return answer;
}