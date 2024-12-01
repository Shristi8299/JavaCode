import java.util.ArrayList;
public class Size{
    public static void  main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int size = list.size();  //4
        System.out.println(size);
       
       for(int i = 0 ; i<size ; i++){
        System.out.print(list.get(i) + " ");
       }

       System.out.println();  //1 2 3 4

       System.out.println(list);  //[1, 2, 3, 4]
        


    }
}