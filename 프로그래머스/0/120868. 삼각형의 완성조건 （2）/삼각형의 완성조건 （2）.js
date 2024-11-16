function solution(sides) {    
    var min = Math.abs(sides[0] - sides[1]);
    var max = sides[0] + sides[1];
    
    return max - min - 1;
}