package ap.livecodes.y404.m2.d30;

import ap.livecodes.y404.m3.d3.FileManager;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner();

        String address = "https://www.znu.ac.ir";
        URL pageLocation = new URL(address);
        Scanner in = new Scanner(pageLocation.openStream());

        List<String> lines=new ArrayList<>();
        FileManager fileManager = new FileManager("C:\\znu.ac.ir/1.html");

        ArrayList<String> hrefList=new ArrayList<>();
        while (in.hasNext()){
            String line=in.next();
            lines.add(line);
            int startIndex = line.indexOf("href=\"");
            if (startIndex>=0){
                try {
                    int hrefLength = "href\"".length();
                    int endIndex = line.indexOf("\"", startIndex + hrefLength + 1);
                    hrefList.add(line.substring(startIndex + hrefLength + 1, endIndex));
                    System.out.println(line);
                }catch (Exception e){}
            }
//            System.out.println(line);

        }
        in.close();
        fileManager.save(lines);
    }
}
