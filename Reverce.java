import java.util.Scanner;

public class Reverce {

    public static void display(int[] r) {
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
    }

    public static void reverce(int[] a) {
       int[] reverced = new int[a.length];
       
       int m = a.length -1;
       int r = 0;
       while (m != 0) {
        reverced[r] = a[m];
        m--;
        r++;
       }

       display(reverced);
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n] ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        reverce(arr);
        
    }
}
