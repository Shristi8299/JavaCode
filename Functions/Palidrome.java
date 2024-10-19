import java.util.*;
public class Palidrome{

    public static boolean checkPalidrome(int num){
        int mynum = num ;
        int reversedNum = 0 ;
        while(num > 0){
            int last_digit = num % 10 ;
            reversedNum = reversedNum* 10  + last_digit;
            num /= 10 ;    
        }

        return reversedNum == mynum ;
    }

    public static void main(String args[]){
    System.out.println(checkPalidrome(123));
    }
}