function solution(num) {    
    if (num === 1) return 0;
    
    let answer = 0;
    
    while (answer < 500) {
        num = num % 2 === 0 ? num / 2 : num * 3 + 1;
        answer++;
        if (num === 1) break;
    }
    
    return answer === 500 ? -1 : answer;
}