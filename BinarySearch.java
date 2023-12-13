import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int l = 0;
        int h = a.length-1;
        

        while (l <= h) {
            int m = (l+h) / 2;
            if (data > a[m]) {
                l = m+1;
            }else if (data < a[m]) {
                h = m-1;
            }else{
                System.out.println(m);
                return;
            }
        }
    }
}
