var fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
var string = input[0].trim().split(' ');
console.log(string[0] == '' ? 0 : string.length);