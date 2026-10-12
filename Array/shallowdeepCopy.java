import java.util.Arrays;

public class shallowdeepCopy{
    public static void main(String [] args){

    //  wht it means??
    //  :-so basically shallow copy means just passing the value of any object..elements not created ..just refrence passed to it..
    //  But in deep copy ..elements also gets copied..two differents obj created with different reference..

    int[] arr={2,3,4,5,6,7};

     // shallow copy
    int[] x=arr;
    x[2]=40;
    System.out.println(arr[2]);

    //deep copy
    int[] y=Arrays.copyOf(arr, arr.length);
    y[3]=50;
    System.out.println(arr[3]);
    System.out.println(y[3]);

    }
}