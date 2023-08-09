var fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
var num = input[0];
var numArray = input[1].split('').map(Number);
var sum = 0;
for (i=0;i<num;i++){
    sum += numArray[i];
}
console.log(sum);