import java.util.LinkedList;
import java.util.Queue;

public class TraversInQueue {

    public static void display(Queue<Integer> q) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }

    // Insert an element at a specific index
    public static void addAtIndex(Queue<Integer> q, int idx, int val) {
        if (idx < 0 || idx > q.size()) {
            System.out.println("invalid index");
            return;
        }

        int n = q.size();

        // Rotate to index position
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        // Insert element
        q.add(val);

        // Rotate back remaining elements
        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }
    }

    // Remove element at a specific index
    public static void Remove(Queue<Integer> q, int idx) {
        if (idx < 0 || idx >= q.size()) {
            System.out.println("invalid idx");
            return;
        }

        int n = q.size();

        // Rotate to element
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        // Remove element
        q.remove();

        // Rotate back remaining items
        for (int i = 0; i < n - idx - 1; i++) {
            q.add(q.remove());
        }
    }

    // Peek at a specific index
    public static int peek(Queue<Integer> q, int idx) {
        if (idx < 0 || idx >= q.size()) {
            return -1;
        }

        int n = q.size();
        int ans = -1;

        for (int i = 0; i < n; i++) {
            int temp = q.remove();
            if (i == idx) ans = temp;
            q.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        display(q);

        addAtIndex(q, 2, 19);
        display(q);

        Remove(q, 3);
        display(q);

       int ans = peek(q,3);
       System.out.print(ans);
    }
}
