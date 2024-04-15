import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(87);
        list.add(74);
       // System.out.println(list.contains(67));
        list.set(0,99);
        list.remove(2);
        System.out.println(list);
        



    }
}
