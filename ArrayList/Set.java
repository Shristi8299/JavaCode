import java.util.ArrayList;
public class Set{
    public static void  main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.set(2,6);  // [1, 2, 6, 4]
        list.add(2,0);  //[1, 2, 0, 6, 4]

        System.out.print(list);
        
    }
}