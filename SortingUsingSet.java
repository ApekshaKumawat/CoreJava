import java.util.*;


public class SortingUsingSet{
    public static void main(String[] args) {



        ArrayList<Integer> arrayList = new ArrayList<>();
         arrayList.add(13);
         arrayList.add(45);
         arrayList.add(30);
         arrayList.add(89);
         arrayList.add(9);
         arrayList.add(300);


         TreeSet<Integer> sortedList = new TreeSet<>(arrayList);

         for(int itr: sortedList){
             System.out.print(itr +" ");
         }

     }
}
