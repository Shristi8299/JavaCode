public class BinToDec{
    public static void binToDec(int binNum){
        int bin = binNum; 
        int pow = 0;
        int decNum = 0 ;

        while(binNum >0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit *(int) Math.pow(2, pow));
            binNum /=10;
            pow++;
        }
        System.out.println("decimal of " + bin+ " = " + decNum);
    }
    public static void main(String args[]){
      binToDec(1010);
    }
}