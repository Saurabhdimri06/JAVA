/*
INPUT IS first number of elements in array
Then the elements one by one
and finally the stored array will be printed by itself
*/
import java.util.*;

public class BasicArray {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}