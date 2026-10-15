
import java.util.*;

public class add2num {
    public static void main(String[] args) {
        System.out.println("Add 2 numbers");

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int x = sc.nextInt();

        System.out.println("Enter the second number:");
        int y = sc.nextInt();

        // Store digits of first number
        while (x > 0) {
            int r = x % 10;
            arr.add(0, r);
            x /= 10;
        }

        // Store digits of second number
        while (y > 0) {
            int r = y % 10;
            arr2.add(0, r);
            y /= 10;
        }

        int i = arr.size() - 1;
        int j = arr2.size() - 1;
        int carry = 0;

        ArrayList<Integer> result = new ArrayList<>();

        // Add digits from right to left
        while (i >= 0 || j >= 0 || carry > 0) {
            int a = (i >= 0) ? arr.get(i) : 0;
            int b = (j >= 0) ? arr2.get(j) : 0;

            int sum = a + b + carry;

            result.add(0, sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        System.out.println("Sum: " );
        int total=0;
        int mul=1;
        for(int u=result.size()-1;u>=0;u--){
            total+=result.get(u)*mul;
            mul*=10;
        }
        System.out.println(total);

        sc.close();
    }
}
