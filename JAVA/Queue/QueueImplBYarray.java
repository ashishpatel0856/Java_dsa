

public class QueueImplBYarray{
    
    int[] arr;
    int f;
    int r;
    int size;

    public QueueImplBYarray(int Capacity) {
        arr = new int[Capacity];
    }

    void add(int val){
        if(size==arr.length){
            System.out.print("queue is full");
            return;
        }
        arr[r++] = val;
        if(r== arr.length) r=0;
        size++;

    }

    int remove(){
         if(size==0){
            System.out.print("queue is empty");
            return -1;
        }
        int frontval = arr[f];
        f++;
        if(r== arr.length) f=0;
        size--;
        return frontval;
    }

    int peek(){
         if(size==0){
            System.out.print("queue is empty");
            return -1;
        }
        return arr[f];
    }
    
    void display(){
        if(size==0) return;
        if(f>=r){
            for(int i=f;i<arr.length;i++){
                System.err.println(arr[i]+"");
            }

            for(int i=0;i<r;i++){
                System.err.println(arr[i]+"");
            }
        }else{
            for(int i =f;i<=r;i++){
            System.out.print(arr[i]+" ");
        }
        }
        System.err.println(" ");
    }

    public static void main(String[] args) {
        QueueImplBYarray q = new QueueImplBYarray(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(80);
        q.display();

        System.err.println("peek:"+ q.peek());

        q.remove();
        q.remove();
        System.err.println("peek:"+ q.peek());

        q.remove();

        q.display();

    }
}