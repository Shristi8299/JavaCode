public class DigitSum{
    public static int digitSum(int num){
        int sum = 0 ;
        while(num > 0){
            int last_digit = num % 10 ;
            sum = sum + last_digit ; 
            num /= 10 ;
        }
        return sum ;

    }
    public static void main(String args[]){
        System.out.println(digitSum(155));
    }
}