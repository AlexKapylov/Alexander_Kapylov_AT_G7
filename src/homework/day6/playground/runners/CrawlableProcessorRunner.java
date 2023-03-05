package homework.day6.playground.runners;

import homework.day6.playground.essence.creatures.*;
import homework.day6.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {

    public static void main(String[] args) {
        CrawlableProcessor myCrawlableProcessor = new CrawlableProcessor();
        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";

            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };
        myCrawlableProcessor.runCrawlable(crawlableCrocodile);
        myCrawlableProcessor.runCrawlable(crawlableBeetle);
        myCrawlableProcessor.runCrawlable((Crawlable) vertebrataCrocodile);
        myCrawlableProcessor.runCrawlable((Crawlable) insectBeetle);
        myCrawlableProcessor.runCrawlable(aCrocodile);
        myCrawlableProcessor.runCrawlable(aBeetle);
        myCrawlableProcessor.runCrawlable(anonymousCrawlable);
        System.out.println("-----------------------------");
        myCrawlableProcessor.runCrawlable(crawlableCrocodile, "никуда");
        myCrawlableProcessor.runCrawlable(crawlableBeetle, "налево");
        myCrawlableProcessor.runCrawlable(aCrocodile, "назад", 37);
        myCrawlableProcessor.runCrawlable(new Crawlable() {
            String name = "Anonymous2";

            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %s units",
                        this.getClass().getSimpleName(), this.name, direction, distance).println();
            }
        }, "вниз", 37);
    }

}
