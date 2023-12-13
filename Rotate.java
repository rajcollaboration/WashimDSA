import java.util.Scanner;

public class Rotate {


    public static void reverce(int[] a, int i, int j) {
       int li= i;
       int ji = j;
       while (li < ji) {
        System.out.println(li+" "+ ji);
        int temp = a[li];
        a[li] = a[ji];
        a[ji] = temp;
        li++; ji --;
       }

    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        reverce(a, 0, a.length -k - 1);
        reverce(a, a.length - k, a.length - 1);
        reverce(a, 0 , a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
