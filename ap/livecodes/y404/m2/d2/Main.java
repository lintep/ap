package ap.livecodes.y404.m2.d2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileAddress = "C:\\Users\\User-Kara-Laptop\\Desktop\\znu\\ap\\src\\ap\\ap\\livecodes\\y404m1d19\\MyMatrix.java";

        Scanner scanner = new Scanner(new File(fileAddress));

        ArrayList<String> tokenList = new ArrayList<>();
        ArrayList<Integer> tokenCount = new ArrayList<>();

        while (scanner.hasNext()){
            String line = scanner.nextLine();
//            ArrayList<String> tokens=new ArrayList<>();
//            for (String token1 : line.split(" ")) {
//                for (String token2 : token1.split(".")) {
//                    for (String token : token2.split(";")) {
//                        tokens.add(token);
//                    }
//                }
//            }
            String[] tokens = line.split("[ .;]");
            for (String token : tokens) {
                if (token.length()==0)
                    continue;

                if (tokenList.contains(token)) {
                    int index=tokenList.indexOf(token);

//                    int oldValue=tokenCount.get(index);
//                    int newValue=oldValue+1;
//                    tokenCount.set(index,newValue);

                    tokenCount.set(index,tokenCount.get(index)+1);
                }
                else{
                    tokenList.add(token);
                    tokenCount.add(1);
                }
            }

            System.out.println(line);
        }

        scanner.close();

        for (int i = 0; i < tokenList.size(); i++) {
            System.out.println(tokenList.get(i)+"\t"+tokenCount.get(i));
        }

        List<String> allTokens = Files.lines(Path.of(fileAddress))
                .map(s -> s.split("[ .;]"))
                .filter(s -> s.length > 0)
                .flatMap(s -> Arrays.stream(s))
                .filter(s -> s.length()>0)
                .collect(Collectors.toList());

//        IntStream.of(tokenCount).sum();
        System.out.println(allTokens.size());
    }
}
