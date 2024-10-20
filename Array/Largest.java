import java.util.*;
public class Largest{
    public static int calLargest(int nums[]){
        int largest = Integer.MIN_VALUE ;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }

            if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        System.out.println("The smallest num is : = " + smallest);
        return largest ; 
    }
    public static void main(String args[]){
         int nums[]= {1,3,7,5};
         System.out.println("The largest num is : = " + calLargest(nums));
    }
}