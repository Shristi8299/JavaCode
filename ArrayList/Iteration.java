import java.util.* ;
public class Iteration{ 
     public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i = 0 ; i < size ; i++){
            String name= sc.next();
            list.add(name);
        }

        System.out.println(list);
     }
}