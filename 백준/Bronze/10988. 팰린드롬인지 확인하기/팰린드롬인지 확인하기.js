var fs = require('fs');
const string1 = require('fs').readFileSync('/dev/stdin').toString().trim();
var string2 = string1.split('').reverse().join('');
console.log(string1 == string2 ? 1 : 0);