var fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('');
var result = 0;
for(var i=0; i<input.length; i++){
    switch(input[i].charCodeAt(0)){
        case 65:
        case 66:
        case 67:
            result += 3;
            break;
        case 68:
        case 69:
        case 70:
            result += 4;
            break;
        case 71:
        case 72:
        case 73:
            result += 5;
            break;
        case 74:
        case 75:
        case 76:
            result += 6;
            break;
        case 77:
        case 78:
        case 79:
            result += 7;
            break;
        case 80:
        case 81:
        case 82:
        case 83:
            result += 8;
            break;
        case 84:
        case 85:
        case 86:
            result += 9;
            break;
        case 87:
        case 88:
        case 89:
        case 90:
            result += 10;
            break;
    }
}
console.log(result);