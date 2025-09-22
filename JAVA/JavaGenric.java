public class JavaGenric{
    public static void main(String[] args) {
        // IntegerDisplay obj = new IntegerDisplay();
        // obj.SetNum(20);
        // obj.display();

        // DoubleDisplay obj1 = new DoubleDisplay();
        // obj1.SetNum(8.2);
        // obj1.display();


        Displayer<Integer> obj2 = new Displayer<>();
        obj2.SetNum(50);
        obj2.display();

         Displayer<Double> obj3 = new Displayer<>();
        obj3.SetNum(50.0);
        obj3.display();
    }

   static class Displayer<T> {
          T num;
        
        public void SetNum(T num){
            this.num = num;
        }
        public void display(){
            System.out.println("element ->"+this.num);
        }
    }
   static class IntegerDisplay{
        Integer num;
        
        public void SetNum(Integer num){
            this.num = num;
        }
        public void display(){
            System.out.println("element ->"+this.num);
        }
    }

     static class DoubleDisplay{
        Double num;
        
        public void SetNum(Double num){
            this.num = num;
        }
        public void display(){
            System.out.println("element ->"+this.num);
        }
    }
}