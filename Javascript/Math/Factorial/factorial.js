const prompt = require("prompt-sync")({ sigint: true });
const num = prompt("Give a number: ");

function factorial(num){
    if (num == 0)
        return 1
    else if (num < 0)
        return "Negative number does not exist"
    else
        return factorial(num-1)*num
}

const output = factorial(num)
console.log(output)