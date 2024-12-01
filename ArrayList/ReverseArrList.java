import java.util.*;
public class ReverseArrList{
    public static void main(String args[]){
       ArrayList<Integer> list = new ArrayList<>();

       for(int i =0 ; i <= 5 ; i++){
        list.add(i);
       }

       System.out.print(list);  // [0, 1, 2, 3, 4, 5]

       System.out.println();
       
       //Reverse print  - O(n)
       for(int i = list.size()-1 ; i >= 0 ; i--){
        System.out.print(list.get(i) + " ");
       }
    }
}