import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int inv = 0;
        int op = 1;

        while (n != 0) {
            int digit = n%10;
            n = n/10;
            int invp = digit;
            int invd  = op;

            inv += inv * Math.pow(10, invd-1);
            op++;



        }
        System.out.println(inv);

    }
}
