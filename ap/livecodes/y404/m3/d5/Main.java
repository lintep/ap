package ap.livecodes.y404.m3.d5;

import ap.projects.scraper.parser.HtmlParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> fileAddressList = new ArrayList<>();
        String filesBasePath = "C:/znu.ac.ir/";
        for (int i = 1; i <= 195; i++) {
            fileAddressList.add(filesBasePath + i + ".html");
        }

//        List<List<String>> x = new ArrayList<>();
//        for (String s : fileAddressList) {
//            x.add(getLines(s));
//        }
        List<String> urls = fileAddressList.stream()
//                .map(fileAddress -> {
//                    return getLines(fileAddress);
//                })
//                .map(s -> {
//                    try {
//                        return Files.lines(Paths.get(s))
//                                .collect(Collectors.toList());
//                    } catch (IOException e) {
//                        return null;
//                    }
//                })
                .map(fileAddress -> getLines(fileAddress))
                .filter(s -> s != null)
                .flatMap(s -> s.stream())
                .map(s -> HtmlParser.getFirstUrl(s))
                .filter(s -> s != null)
                .filter(s -> s.length() > 1)
                .collect(Collectors.toList());

        HashMap<String,Integer> counter=new HashMap<>();
        for (String url : urls) {
            if (counter.containsKey(url)){
                counter.put(url, counter.get(url)+1);
            }
            else{
                counter.put(url,1);
            }
        }

        System.out.println(urls.size());

    }

    public static List<String> getLines(String filePath){
        System.out.println("start to get lines of "+filePath);
        try {
            return Files.lines(Paths.get(filePath))
                    .collect(Collectors.toList());
        } catch (IOException e) {
//            throw new RuntimeException(e);
            return null;
        }
    }

}
