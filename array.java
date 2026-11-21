import java.util.*;
public class array{
    public static int Largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks[] = {97,98,99,100,95};
        int largest = Largest(marks);
        System.out.println("The largest mark is: " + largest);
        
        }
      

         
    }
