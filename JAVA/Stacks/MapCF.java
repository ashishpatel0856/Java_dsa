import java.util.*;
public class MapCF{
    public static void main(String[] args){
         
        Map<Integer ,String> classMap = new HashMap<>();
        classMap.put(1,"ashish");
        classMap.put(2,"kareena");
        classMap.put(5,"sani");
        classMap.put(4,"shiva");
        classMap.putIfAbsent(1,"saurabh");
        System.out.println(classMap);

        System.out.println(classMap.get(4));
       System.out.println(classMap.getOrDefault(8,"no key value present"));
       System.out.println(classMap.containsKey(2));
       System.out.println(classMap.containsValue("kareena"));

    //    reverse the value
       for(Map.Entry<Integer ,String> entry : classMap.entrySet() ){
        System.out.print("key :"+ entry.getKey());
         System.out.println("value :"+ entry.getValue());
       }


    }
}