import java.util.*;
public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a=new ArrayDeque<>();
        a.add(59);
        a.add(78);
        a.add(99);
        a.add(96);
        a.offerFirst(6);
        a.offerLast(25);
        System.out.println(a);
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());
        System.out.println(a.getLast());
        System.out.println(a.getFirst());
        a.pollFirst();//remove the first element 
        System.out.println(a);
        a.removeFirst();//remove the next first element
        System.out.println(a);
        a.pollLast();//remove the last element
        System.out.println(a);
        a.removeLast();//remove the next last element
        System.out.println(a);
    
    }
}
