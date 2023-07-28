var fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);

for (var i = 1; i <= 30; i++){
    if(input.indexOf(i) == -1) console.log(i);
}