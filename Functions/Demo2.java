import java.util.*;
public class Demo2{

    //function calculateSum
    public static int calculateSum(int a , int b){  // parameters or formal parameters
        return a+b;
    }


    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int sum = calculateSum(a,b); //actual parameters or arguments
     System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}