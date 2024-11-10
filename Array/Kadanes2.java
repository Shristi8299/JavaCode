//if all no's are negative then 
public class Kadanes2{
    public static int Kadanes2(int [] nums){
        int cs = 0;
        int ms = Integer.MIN_VALUE ;
        for(int i = 0 ; i < nums.length ; i++){
            cs = Math.max(nums[i] ,cs + nums[i] );
            ms = Math.max(ms , cs);
        }
        return ms ;
    }
    public static void main(String args[]){
        int nums [] = {-2, -3, -4, -1, -2, -1, -5, -3}  ; 
        System.out.println(Kadanes2(nums));
    }
}