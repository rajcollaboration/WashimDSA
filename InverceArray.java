import java.util.Scanner;

public class InverceArray {
    public static void inverce (int[] a){
        int i = 0;
        while (i < a.length) {
            int temp = a[i];
            int next = a[temp];
             a[temp] = next;
             a[next] = temp;
             i++;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a= new int[n];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        inverce(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
