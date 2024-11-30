import java.util.ArrayList;
public class Add{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0,6);

        System.out.print(list);

    }
}