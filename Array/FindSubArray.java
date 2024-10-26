public class FindSubArray{
    public static void printSubArray(int [] nums){
        int  totalSubarray = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            int start = i;
            for(int j = i ; j < nums.length ; j++){
                int end = j ;
                for(int k = i ; k <= j ; k++){
                    System.out.print(nums[k] + "  ") ;
                }
                totalSubarray++ ;
                System.out.println();
               
            }
        System.out.println();
     }
     System.out.println("total Subarray =  " + totalSubarray);
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        printSubArray(nums);
    }
}