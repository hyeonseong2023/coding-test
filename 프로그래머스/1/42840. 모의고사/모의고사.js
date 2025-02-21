function solution(answers) {
    var answer = [];
    
    var inputs = [{
        val: '12345',
        score: 0
    },
    {
        val: '21232425',
        score: 0
    },
    {
        val: '3311224455',
        score: 0
    }];
    
    function scorePlus(obj, i) {
        if(Number(obj.val[i % obj.val.length]) === answers[i]) {
            obj.score++;
        }
    }
        
    for(let i = 0; i < answers.length; i++) {
        for(let j = 0; j < inputs.length; j++) {
            scorePlus(inputs[j], i);
        }
    }
    
    const max = Math.max(inputs[0].score, inputs[1].score, inputs[2].score);
        
    return inputs.reduce((acc, e, i) => {
        if(e.score === max) acc.push(i + 1);
        return acc;
    }, []).sort((a, b) => a - b);
}