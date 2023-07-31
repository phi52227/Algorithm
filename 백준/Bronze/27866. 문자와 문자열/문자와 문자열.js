var fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
var string = input[0];
var idx = input[1];
console.log(string[idx - 1]);