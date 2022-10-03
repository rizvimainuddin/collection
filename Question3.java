package Collection;
import java.util.ArrayList;


public class Question3 {

    ArrayList<Integer> list = new ArrayList<>();
    int capacity = 0;
    int totalCapacity = 0;

    void push(int a) {
        list.add(a);
        capacity++;
        totalCapacity++;
    }

    public Boolean pop() {
        if (list.isEmpty()) {
            return false;
        }
        Integer top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        capacity--;
        return true;

    }

    void Display() {
        for (int i = capacity - 1; i >= 0; --i)
            System.out.print(list.get(i) + " ");
    }

    void getMin() {
        if (!list.isEmpty()) {
            int minimum = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (minimum > list.get(i))
                    minimum = list.get(i);
            }
            System.out.println(minimum);
        } else System.out.println("Empty Stack");
    }

    Boolean isFull() {
        if (totalCapacity == list.size())
            return true;
        else
            return false;
    }

    Boolean isEmpty() {
        if (totalCapacity > capacity)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Question3 stack = new Question3();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(110);

        stack.Display();
        System.out.println("\nis full : " + stack.isFull());
        System.out.println("is empty : " + stack.isEmpty());


        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.Display();
        System.out.println("\nis full : " + stack.isFull());
        System.out.println("is Empty : " + stack.isEmpty());

        System.out.print("min is :");
        stack.getMin();
    }
}
