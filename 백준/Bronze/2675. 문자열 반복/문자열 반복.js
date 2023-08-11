var fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
var num = input[0];
var line = [];
var times = 0;
var string;
var result;
for (i=1;i<=num;i++){
    line = input[i].split(' ');
    times = line[0];
    string = line[1];
    result = "";
    for(j=0;j<string.length;j++){
        for(var time=0;time<times;time++){
            result += string[j];
        }
    }
    console.log(result);
}