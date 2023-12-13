import java.util.Scanner;

public class PrintAllPrimesTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int min_Num = scn.nextInt();
        int max_Num = scn.nextInt();
        for (int i = min_Num; i < max_Num; i++) {
            int div = 2;
            while (div <= i) {
                if (i % div == 0) {
                    div ++;
                    break;
                }

               div++;

            }
             if ( div < min_Num) {
                    System.out.println("prime");
                }else{
                    System.out.println("Not prime");
                }
        }
    }
}
