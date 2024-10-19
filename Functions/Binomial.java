public class Binomial{
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1 ;
        }else{
            return n * fact(n-1);
        }
    }

    public static void binomial_Cofficient(int n , int r){
     int n_fact = fact(n);
     int r_fact = fact(r);
     int n_r_fact = fact(n-r);

     int bin_Coff =  n_fact / (r_fact * n_r_fact);

     System.out.println(bin_Coff);

    }
    public static void main(String args[]){
     
     int n  = 5 ;
     int r = 2 ;
     
     binomial_Cofficient( n , r);
    
    }
}