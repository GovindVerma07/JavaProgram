import java.util.Scanner;
public class Calculator {
   public static void main(String[] args){
     int ch;
     Scanner sc = new Scanner(System.in);
     int num1,num2;
     System.out.println("Enter 2 Numbers : ");
     num1 = sc.nextInt();
     num2 = sc.nextInt();
     System.out.println("Enter 1 for Addition");
     System.out.println("Enter 2 for Subtraction");
     System.out.println("Enter 3 for Multiplication");
     System.out.println("Enter 4 for Division");
     ch = sc.nextInt();
     switch(ch){
        case 1 ->  System.out.println(num1+num2);
        case 2 ->  System.out.println(num1-num2);
        case 3 ->  System.out.println(num1*num2); 
        case 4 ->  System.out.println(num1/num2);  
     }
   } 
}
