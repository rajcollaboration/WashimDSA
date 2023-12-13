import java.util.Scanner;

/**
 * digitOFaNumber
 */
public class digitOFaNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();
        int temp = number;
        int digit = 0;
        while (temp != 0) {
             temp = temp/10;
            number = temp;
            digit++;
        }
        System.out.println(digit);
        int div = (int)Math.pow(10, digit-1);
        System.out.println(div);
        while (div != 0) {
            int q = number / div;
            System.out.println(q);
            number = number%div;
            div = div / 10;


        }
    }
}