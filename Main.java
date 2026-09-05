import java.util.*;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("ENTER YOUR CHOICE");
    System.out.println("1 : + (Addition) a + b");
    System.out.println("2 : - (Subtraction) a - b");
    System.out.println("3 : * (Multiplication) a * b");
    System.out.println("4 : / (Division) a / b");
    System.out.println("5 : % (Modulo or remainder) a % b");
    int choice = sc.nextInt();
    switch (choice) {
        case 1:
            int sum = a + b;
            System.out.println(sum);
            break;
        case 2:
            int sub = a - b;
            System.out.println(sub);    
            break;
        case 3:
            int mul = a * b;
            System.out.println(mul);
            break; 
         case 4:
            if (b == 0){
            System.out.println("Error: Division by zero is not allowed.");
            break;
            }
            else{
            int div = a / b;
            System.out.println(div);
            break;
            }
         case 5:
            if (b == 0) {
            System.out.println("Error: Modulo by zero is not allowed.");
            break;
            } else {
            int reminder = a % b;
            System.out.println(reminder);
            break;
            }
            default:
                System.out.println("INVALID CHOICE");
            break;
    }
    
}
}