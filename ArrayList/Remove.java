import java.util.ArrayList;
public class Remove{
    public static void  main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        //delete -O(n)
        list.remove(3);  // [1, 2, 3]                
        System.out.println(list);


        //contains operation
        System.out.println(list.contains(1));  
        System.out.println(list.contains(3));
        System.out.println(list.contains(10));

         
    // true
    // true
   // false


        
    }
}