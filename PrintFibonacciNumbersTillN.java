import java.util.Scanner;

public class PrintFibonacciNumbersTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0;
        int second = 1;

        for(int i = 2; i < n; i++) {
            int next = first+second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
    }

