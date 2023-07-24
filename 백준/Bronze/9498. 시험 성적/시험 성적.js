var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split(' ');
var a = parseInt(input[0]);
console.log(a >= 90 ? 'A' : a >= 80 ? 'B' : a >= 70 ? 'C' : a >= 60 ? 'D' : 'F');