var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split(' ');
var a = parseInt(input[0]);
console.log((a % 4 == 0 && a % 100 != 0) || a % 400 == 0 ? 1 : 0);