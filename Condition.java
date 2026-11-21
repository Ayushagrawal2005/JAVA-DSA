import java.util.*;
public class Condition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int a = sc.nextInt();
        if(a>18){
            System.out.println("is adult");
        }else{
            System.out.println("Not adult");
        }


    }
}