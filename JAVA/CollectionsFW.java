
import java.util.*;
public class CollectionsFW {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(7);
        list.add(14);
        list.add(2);
        System.out.println(list.size());
        System.out.println(list);

        // iterator
        // Iterator<Integer> itr = list.iterator();
        // System.out.println("my list is");
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }


        // sorting  
        // list.sort(new Comparator<Integer>(){
        //     public int compare(Integer A, Integer B){
        //         return A -B;
        //     }
        // } );
        // System.out.println(list);



        List<Student> lists = new ArrayList<>();
        lists.add(new Student(10,"Ashish Patel"));
        lists.add(new Student(10,"Ankit patel"));

        lists.add(new Student(11,"Kareena Patel"));
       lists.add(new Student(20,"Asmita Patel"));
        lists.add(new Student(31,"Shiv Patel"));
        lists.add(new Student(40,"Shivakant maurya"));

     lists.sort(new Comparator<Student>(){
            public int compare(Student A, Student B){
                // return B.rollNumber - A.rollNumber;
                int res = B.rollNumber - A.rollNumber;
                if(res ==0){
                   return A.name.compareTo(B.name);
                }
                return res;
            }
        } );
        System.out.println(lists);
    }
   
}



class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber,String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }
     public String toString(){
        return name;
    }
}