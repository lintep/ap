package ap.lc10_07;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        HashSet<Integer> integerSet = new HashSet<>();

        int size=10000000;
        for (int i = 0; i < size; i++) {
            integerSet.add((int)(Math.random()*size));
        }
        System.out.println(integerSet.size());

        integerSet.clear();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            integerSet.add(random.nextInt(size*10));
        }
        System.out.println(integerSet.size());

        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println(integerSet.contains(x));
        }
    }
}
