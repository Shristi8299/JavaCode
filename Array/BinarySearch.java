public class BinarySearch{
    public static int binarySearch(int [] numbers , int target){
        int start = 0 , end = numbers.length - 1 ;
        while(start <= end){
            int mid = (start + end) / 2 ;
            if(numbers[mid] == target){
                return mid;
            }else if( numbers[mid] < target){
                start = mid + 1 ;
            }else{
                end = mid -1 ;
            }
        }

        return -1 ;
    }
    public static void main(String args[]){
        int numbers [] = { -1 , 0 , 1, 3, 5, 8, 10, 11 } ;
        int target = 11;
        System.out.println("The target found at index = " + binarySearch(numbers , target));
    }
}



// Note - suitable for only sorted array 
// time complexity of this program is O(log n)
// space complexity  - O(1) ; no additional stack or memory required 