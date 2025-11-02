import java.util.HashMap;

public class Day1{

     static class MyCollege {
        int regNo;

        MyCollege(int regNo) {
            this.regNo = regNo;
        }

        @Override
        public boolean equals(Object obj) {
            MyCollege college = (MyCollege) obj;
            return this.regNo == college.regNo;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(regNo);
        }

        @Override
        public String toString() {
            return "MyCollege{" + "regNo=" + regNo + '}';
        }
    }

    static class MyRanking {
        int rank;

        public MyRanking(int rank) {
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "MyRanking{" + "rank=" + rank + '}';
        }
    }

    public static void main(String[] args) {
        // HashMap<Integer,String> map = new HashMap<>();
        // // put function if value not have then store the value and have then update the value
        // map.put(1,"ashish");
        // map.put(2,"kareena");
        // map.put(3,"saurabh");
        // map.put(4,"shivam");
        // System.out.println(map);
        // map.put(3,"shiva");
        // System.out.println(map);

        // System.out.println(map.get(2));
        // System.out.println(map.containsKey(2));// true
        // System.out.println(map.getOrDefault(5,"not present"));
        // map.replace(2, "ankit");
        // System.out.println(map);

        // for each loop
        
        // for(Map.Entry<Integer,String> entry : map.entrySet()){
        //     System.out.println("Key ->"+entry.getKey());
        //     System.out.println("value ->"+entry.getValue());
        // }

        //  or same work 
        // for(Integer key : map.keySet()){
        //     System.out.println("Key ->"+key);
        //     System.out.println("value ->"+map.get(key));
        // }





        HashMap<Integer ,Integer> collegeRankingMap = new HashMap<>();
        collegeRankingMap.put(111,1);
        collegeRankingMap.put(320,2);
        collegeRankingMap.put(452,3);
        System.out.println(collegeRankingMap.get(111));


        HashMap<MyCollege ,MyRanking> collegeRankingMap2= new HashMap<>();
        collegeRankingMap2.put(new MyCollege(111),new MyRanking(1));
        collegeRankingMap2.put(new MyCollege(320),new MyRanking(2));
        collegeRankingMap2.put(new MyCollege(452),new MyRanking(3));
        
        System.out.println(collegeRankingMap2.get(new MyCollege(111)));
    }


}