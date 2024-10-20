function solution(balls, share) {
    var factorial = (arg) => {
        var sum = BigInt(1);
        while(arg !== 0){
            sum *= BigInt(arg);
            arg--;
        }
        return sum;
    }
    
    return BigInt(factorial(balls)) / (BigInt(factorial(balls - share)) * BigInt(factorial(share))); 
}