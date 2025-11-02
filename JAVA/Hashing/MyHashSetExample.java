import java.util.HashSet;
import java.util.Iterator;

public class MyHashSetExample{
   public static void main(String[] args){
    HashSet<Integer> set  = new HashSet<>();
    set.add(4);
    set.add(8);
    set.add(12);
    set.add(10);

    System.out.println(set);

   //  System.out.println(set.contains(4));
   //  System.out.println(set.remove(4));
   //  System.out.println(set);

   // iterrate
   // for(Integer i:set){
   //    System.out.println(i);
   // }



   // remove the element
   Iterator<Integer> itr = set.iterator();
    while(itr.hasNext())
    {
      System.out.println(itr.next());
      itr.remove();
    }
   } 
}