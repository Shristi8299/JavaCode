public class FindPairs{
    public static void findPairs(int [] nums){
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                System.out.print("( " + nums[i] + " , " +  nums[j] + " )" + "  ");
                count++;
            }
            System.out.println();
        }
            System.out.println("The  total no of possible pairs for an array is = " + count);
    }
    public static void main(String args[]){
        int nums [] = {2,4,6,8,10};
        findPairs(nums);
    }
}