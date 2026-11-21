import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0;
        /*for(i=1;i<=4;i++){
           System.out.println("****");
        }*/
       // Reversing the number
       while(n>0){
        int digit = n%10;
        System.out.print(digit);
        n=n/10;
       }
      System.out.println(); 
    }
}