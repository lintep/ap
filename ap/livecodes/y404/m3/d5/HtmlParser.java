package ap.livecodes.y404.m3.d5;

public class HtmlParser {

    public static String getFirstUrl(String htmlLine) {
        String url = null;
        int startIndex = htmlLine.indexOf("href=\"");
        if (startIndex >= 0) {
            try {
                int hrefLength = "href\"".length();
                int endIndex = htmlLine.indexOf("\"", startIndex + hrefLength + 1);
                url = htmlLine.substring(startIndex + hrefLength + 1, endIndex);
            } catch (Exception e) {
            }
        }
        return url;
    }

}
