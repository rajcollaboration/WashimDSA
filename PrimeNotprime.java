import java.util.Scanner;

public class PrimeNotprime {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int numbers = scn.nextInt();
    for (int i = 0; i < numbers; i++) {
        int t = scn.nextInt();
        int div = 2;
        while (div <= t) {
           if (t % div == 0) {
            break;
           }
           else div++;
        }


        if (div * div > t) {
            System.err.println("prime");
        }else{
            System.err.println("not prime");
        }
    }
    
  }
}