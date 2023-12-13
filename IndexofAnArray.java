import java.util.Scanner;

public class IndexofAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int findn = scn.nextInt();

        int index = -1 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findn) {
                index = i;
                break;
            }
        }

        System.out.println(index);
       
    }
}
