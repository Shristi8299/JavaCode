import java.util.*;
public class CheckNum{
    public static boolean isEven(int num){
       return (num % 2 == 0);
    }
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the  Number that you want to check:  ");
          int num = sc.nextInt();
          if(isEven(num)){
            System.out.println("Number is a even no!");
         }else{
            System.out.println("Number is a odd no!");
         }
    }
}