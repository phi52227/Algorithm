var fs = require('fs');
var input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);
input = input.map(x => x % 42);
let set = new Set(input);
let arr = [...set];
console.log(arr.length);