import java.util.*;
public class Largest{
    public static void main(String args[]){
        int A = 5 , B=6 , C = 3;
        if(A>=B && A>=C){
            System.out.println(A);

        }else if (B>=A && B>=C){
            System.out.println(B);

        }else{
            System.out.println(C);
        }
    }
}