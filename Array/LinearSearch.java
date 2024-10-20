public class LinearSearch{
    public static int linearSearch(String menu[] , String key){
        for(int i = 0 ; i < menu.length ; i++){
            if(menu[i].equals(key)){
                return i;
            }
        }
       return -1;

    }
    public static void main(String args[]){
        String menu[] = {"samosa" , "cold-drink" , "chole-bhaturre" , "aloo-parathe" , "kachauri" , "petiz"} ;
        String key = new String("kachauri");

        int index = linearSearch(menu , key);
        if(index == -1){
            System.out.println("NOT found!");
        }
        else{
            System.out.println("Item found at index : =  " + index );
        }
    }
}

//time complexity - O(n)
//space complexity - O(1) because not extra space used by algorithm except few variable like i and key etc.