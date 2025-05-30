package ap.projects.scraper;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String domainAddress = "https://znu.ac.ir";
        String savePath = "fetched_znu.ac.ir";

        DomainHtmlScraper domainHtmlScraper = new DomainHtmlScraper(domainAddress,savePath);

        domainHtmlScraper.start();
    }
}
