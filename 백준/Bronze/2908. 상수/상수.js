var fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ');
var num1 = parseInt(input[0].split('').reverse().join(''));
var num2 = parseInt(input[1].split('').reverse().join(''));
console.log(num1 > num2 ? num1 : num2);