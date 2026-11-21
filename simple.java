import java.util.*;
public class simple{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        float p = sc.nextFloat();
        System.out.println("Enter the rate of interest:");
        float r = sc.nextFloat();
        System.out.println("Enter the time period:");
        float t = sc.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("The simple interest is: " + si); 
        Float Amount = p + si;
        System.out.println("The total amount is: " + Amount);   
    }
}