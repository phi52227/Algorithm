var fs = require('fs');
var input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);
let set = new Set(input.map(x => x % 42));
let arr = [...set];
console.log(arr.length);