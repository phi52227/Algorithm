var fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
var nums = input[0].split(' ');
var num1 = parseInt(nums[0].split('').reverse().join(''));
var num2 = parseInt(nums[1].split('').reverse().join(''));
console.log(num1 > num2 ? num1 : num2);