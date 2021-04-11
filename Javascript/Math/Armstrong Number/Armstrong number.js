// Takes user input for this package install prompt-sync
// npm install prompt-sync
//if you installed the prompt-sync then uncomment the line 5 and 6 then 
//comment the 8th line
//const prompt = require("prompt-sync")({ sigint: true });
//const num = prompt("Give a number: ");

const num = 1634

var sum = 0; var size = 0; var temp = num; var temp2 = num

while(temp2!=0){
    size += 1
    temp2 = Math.floor(temp2/10)
}

while(temp!=0){
    remainder = temp%10
    sum += remainder**size
    temp = Math.floor(temp/10)
}

if(sum == num){
    console.log(num, "is an Armstrong number")
}
else{
    console.log(num, "is not an Armstrong number")
}

//Input 1: 
//1634
//Output 1:
//It's an Armstrong number

//Input 2: 
//1630
//Output 2:
//It's not an Armstrong number