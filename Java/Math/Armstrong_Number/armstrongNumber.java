import java.util.Scanner;

//import java.util.*;

public class armstrongNumber{
    private static Scanner scanner;
    
    public static int powers(int r, int s){
        int a = 1;

        for(int k=1; k<=s;k++){
            a *= r;
        }

        return a;    
    }
    public static void main(String args[]){
        scanner = new Scanner(System.in);
        
        System.out.println("Enter a Armstrong Number");
        
        int num = scanner.nextInt();
        
        int sum = 0; 
        int size = 0; 
        int temp = num; 
        int temp2 = num;

    temp = num;
    temp2 = num;
    int remainder;
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
        System.out.println(num+", It's an Armstrong number");
    }

    else{
        System.out.println(num+ ", It's not an Armstrong number");
    }
    }
}

/*num = int(input("Enter a number: ")) 

sum = 0; size = 0; temp = num; temp2 = num

while(temp2!=0):
    size += 1
    temp2 = int(temp2/10)

while(temp!=0):
    remainder = temp%10
    sum += remainder**size
    temp = int(temp/10)

if(sum == num):
    print("It's an armstrong number")
else:
    print("It's not an armstrong number")
*/