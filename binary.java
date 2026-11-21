import java.util.*;
public class binary {
    public static int binary_search(int arr[],int key){
        int start = 0;  
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    

public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the key to search: ");
        int key = sc.nextInt();
        int result = binary_search(arr,key);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: " + result);
        }
    }
}