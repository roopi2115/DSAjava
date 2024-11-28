import java.util.ArrayList;
public class array{
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        for(int i=0;i<5;i++){
            a1.add(i);
        }
        
        a1.add(3,8);
        a1.remove(3);
        
       for(int j=0;j<6;j++){
        a2.add(j);
        }
       a1.equals(a2);
       // a1.addAll(a2);
        //  System.out.println(a1);
       a1.clear();
       System.out.println(a1); 
        }
    }
