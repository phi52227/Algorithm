var fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
var count = parseInt(input[0]);
var scoreArray = input[1].split(' ').map(Number);
const maxScore = Math.max(...scoreArray);
let totalScore = 0;
for (var i = 0; i < count; i++){
    totalScore += scoreArray[i] / maxScore * 100
}
console.log(totalScore / count);