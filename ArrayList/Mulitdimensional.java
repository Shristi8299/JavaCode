import java.util.*;
public class Multidimensional{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1 ; i<=5 ; i ++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

         System.out.println(mainList); // [[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15]]

         //printing via loop

         for(int i= 0 ; i < mainList.size() ; i++){
            ArrayList<Integer>currList = mainList.get(i);
            for(int j = 0 ; j< currList.size() ; j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();

            //output 
                   

            
         }


    }
}