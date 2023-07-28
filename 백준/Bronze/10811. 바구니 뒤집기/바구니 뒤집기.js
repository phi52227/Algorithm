var fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
var [arrayLength, changeTime] = input[0].split(' ').map(Number);
var array = [];
for (var i = 1; i <= arrayLength; i++){
    array.push(i);
}
for (var j = 1; j <= changeTime; j++){
    var [x, y] = input[j].split(' ').map(Number);
    while (x < y){
        var tmp = array[x - 1];
        array[x - 1] = array[y - 1];
        array[y - 1] = tmp;
        
        x++;
        y--;
    }
    
}
console.log(array.join(" "));