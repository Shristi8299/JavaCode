import java.util.*;
public class Average{
    public static double calAvg(double a , double b, double c){
        double avg = (a + b + c)/3;
        return avg;
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        double a = sc.nextDouble();

        System.out.println("Enter the second Number: ");
        double b = sc.nextDouble();

        System.out.println("Enter the third Number: ");
        double c = sc.nextDouble();

        System.out.println("The resultant average is :  " + calAvg(a , b, c));

    }
}