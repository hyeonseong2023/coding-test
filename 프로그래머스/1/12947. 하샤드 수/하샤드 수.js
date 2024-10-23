function solution(x) {
    var answer = true;
    var sum = 0;
    var tempX = x;
    
    while(true) {
        if(Math.floor(x / 10) !== 0){
            sum += x % 10;
            x = Math.floor(x / 10);
        } else {
            sum += x;
            break;
        }
    }

    return tempX % sum === 0 ? true : false;
}