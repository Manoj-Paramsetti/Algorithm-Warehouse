import java.util.Scanner;

public class armstrongNumber{
    private static Scanner scanner;
    //To find power
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

        //To find the number of digits
        while(temp2!=0){
            size+=1;
            temp2 = temp2/10;
        }

        //calculating Armstrong Number
        while(temp!=0){
            remainder = temp%10;
            sum += powers(remainder, size);
            temp = temp/10;
        }
        
        //Checking the given number is Armstrong Number
        if(sum == num){
            System.out.println(num+", It's an Armstrong number");
        }

        else{
            System.out.println(num+ ", It's not an Armstrong number");
        }
    }
}