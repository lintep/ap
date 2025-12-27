import java.util.Arrays;
import java.util.Scanner;

public class Main08_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n:");
//        int n = scanner.nextInt();
        int n = Integer.parseInt(scanner.nextLine());

        int[] inputArray=new int[n];
        for (int i = 0; i < n; i++) {
//            Scanner tempScanner = new Scanner(System.in);
//            inputArray[i] = Integer.parseInt(scanner.nextLine());
            inputArray[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int value : inputArray) {
            System.out.print(value+" ");
        }
        System.out.println();

        Arrays.sort(inputArray);

        for (int value : inputArray) {
            System.out.print(value+" ");
        }
        System.out.println();

    }
}
