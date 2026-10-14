import java.util.*;
public class basic {
    public static void main(String[] args){
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        System.out.print(arr.size());
        arr.add(1,2);
        System.out.print(arr.get(2));
        arr.set(2,452);
      System.out.print(arr.get(2));
      Collections.reverse(arr);
      System.out.print(arr);
      arr.add(1);
      System.out.println(arr.get(2));


    }
    
}
