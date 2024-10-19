public class Factorial {

//Basic method 
        public static int method1(int n){
        int fact = 1 ;
        for(int i = 1 ; i <= n ; i++){
            fact = fact * i ;
        }

        return fact;
    }


//Recursive method

    public static int factorial(int n){
        if(n==0 || n == 1 ){ //base case 
            return 1 ;
        }
        else{
            return n*factorial(n-1);
        }
    }



    public static void main(String args[]){
      System.out.println(method1(4));
      System.out.println(factorial(5));
     

    }
}