import java.util.Stack;
public class stack{
    public static void main(String[] args) {
        Stack<String> ex =new Stack<>();
        //push
        ex.push("Apple");
        ex.push("Orange");
        ex.push("Banana");
        System.out.println(ex);
        //pop
        String popel=ex.pop();
        //after poping the element
        System.out.println(ex);
        //poped element
        System.out.println(popel);
        //search
         int index=ex.search("Apple");
         if(index!=-1){
            System.out.println("It is present");
         }
         else{
            System.out.println("It is not present");
         }
     //size
     System.out.println(ex.size());
     System.out.println(ex.isEmpty());

    }
}
