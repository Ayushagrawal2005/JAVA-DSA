import java.util.*;
public class calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the operetaor (+,-,*,/):");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("The sum is "+(a+b));
                break;
            case '-':
                System.out.println("The difference is "+(a-b));
                break;
            case '*':
                System.out.println("The product is "+(a*b));
                break;
            case '/':
                if (b<=0) {
                    System.out.println("Invalid input");
                    
                }else{
                    System.out.println("The quotient is "+(a/b));
                }break;
        
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
    
}
