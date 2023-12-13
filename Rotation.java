import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int temp = n;
        int nod = 0;
        while (temp != 0) {
            temp = temp/10;
            nod++;
        }

        if (nod < k) {
            k =  k % nod;
        }

        System.out.println("k "+ k);

        if (k < 0) {
            k = k+nod;
        }

        int div = 1;
        int mul = 1;

        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
               div = div*10; 
            }else{
                mul = mul*10;
            }
        }

        int rim = n%div;
        int qsnt= n/div;

        int rotation = rim*mul+qsnt;




        System.out.println(rotation);
    }
}
