package ap.livecodes.y404.m3.d3;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
//        String urlAddress = "https://www.znu.ac.ir";
        int counter=1;
        String filePath="C:\\znu.ac.ir/"+counter+".html";
//        fetch(urlAddress,filePath);

//        Stream<String> fileLines = Files.lines(Path.of(filePath));
//        Files.lines(Path.of(filePath)).map(s -> s.length());

        int charCount=new FileManager(filePath).getCharCount();
        System.out.println(charCount);

        Queue<String> queue = new LinkedList<>();
        Set<String> urls = geturls(filePath);
        for (String url : urls) {
            counter++;
            filePath="C:\\znu.ac.ir/"+counter+".html";
            try {
                fetchAndSave(url,filePath);
                Set<String> newUrls = geturls(filePath);
                queue.addAll(newUrls);
            }
            catch (Exception e){
                System.out.println("ERROR: "+url+"\t -> "+e.getMessage());
            }
        }
        System.out.println(urls.size());

    }

    private static Set<String> geturls(String filePath) throws IOException {
        Set<String> urls = Files.lines(Path.of(filePath))
                .map(line -> {
                    String url = null;
                    int startIndex = line.indexOf("href=\"");
                    if (startIndex >= 0) {
                        try {
                            int hrefLength = "href\"".length();
                            int endIndex = line.indexOf("\"", startIndex + hrefLength + 1);
                            url = line.substring(startIndex + hrefLength + 1, endIndex);
                        } catch (Exception e) {
                        }
                    }
                    return url;
                })
                .filter(s -> s!=null)
                .collect(Collectors.toSet());
        return urls;
    }

    private static void fetchAndSave(String urlAddress, String filePath) throws IOException {

        URL pageLocation = new URL(urlAddress);
        Scanner in = new Scanner(pageLocation.openStream());

        List<String> lines=new ArrayList<>();
        FileManager fileManager = new FileManager(filePath);

        while (in.hasNext()){
            lines.add(in.next());
        }
        in.close();
        fileManager.save(lines);
        System.out.println(urlAddress+" saved.");
    }
}
