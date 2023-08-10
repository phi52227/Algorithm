var fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
var string = input[0];
var isArray = [];
for (i=97;i<=122;i++){
    isArray.push(string.indexOf(String.fromCharCode(i)));
}
console.log(isArray.join(' '));