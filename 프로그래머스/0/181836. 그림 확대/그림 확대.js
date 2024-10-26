function solution(picture, k) {
    var answer = [];    
    picture.forEach((item) =>{        
        answer.push(...new Array(k).fill([...item].map(v => v.repeat(k)).join('')));
    })
    return answer;
}