import java.util.*;
public class backspace{
    public static int removeDuplicates(int [] nums) {
        if(nums.length == 0) return 0;
        int k = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {  
int[] a = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};  
int k = removeDuplicates(a);  
System.out.println(k + " " + Arrays.toString(Arrays.copyOf(a, k)));  }  
} 
