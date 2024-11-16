function solution(spell, dic) { 
    var isExistence = dic.some(dicE => {
        var isExistenceCheck = true;
        spell.forEach(spellE => {
            if (!dicE.includes(spellE)) isExistenceCheck = false;                
        })
        if(isExistenceCheck) return true;
    });    
    
    return isExistence ? 1 : 2;
}