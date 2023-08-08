var fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
var num = input[0];
for (i=1;i<=num;i++){
    var string = input[i][0] + input[i][input[i].length - 1];
    console.log(string)
}