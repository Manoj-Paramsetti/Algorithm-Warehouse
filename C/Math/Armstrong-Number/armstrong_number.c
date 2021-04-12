#include<stdio.h>

//Power Calculator
int powers(int r, int s){

    int a = 1;

    for(int k=1; k<=s;k++){
        a *= r;
    }

    return a;

}

int main(){

    int num, remainder, temp, temp2, sum = 0, size = 0;
    
    scanf("%d",&num);
 
    temp = num;
    temp2 = num;
    
    while(temp2!=0){
        size+=1;
        temp2 = temp2/10;
    }

    while(temp!=0){
        remainder = temp%10;
        sum += powers(remainder, size);
        temp = temp/10;
    }

    if(sum == num){
        printf("armstrong number");
    }

    else{
        printf("not a armstrong number");
    }

}