public class Prime{

    public static boolean checkPrime(int n){
        if(n < 2){
            return false;
        }
        if(n ==2){
            return true ;
        }

        for(int i = 2 ; i<= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true ;
    }

     public static void primeInRange(int range){
        for(int i = 1 ; i <=range ; i++){
            if(checkPrime(i)){
                return i ;

            }

             System.out.println("prime no's till "+ range + " are " + i + ",");          
        }

       
     }

    public static void main(String args[]){
    // System.out.println(checkPrime(8));
      primeInRange(10);
    }
}