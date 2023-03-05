package homework.day6.playground.processors;

import homework.day6.playground.essence.creatures.Crawlable;
import homework.day6.playground.utils.DirectionGenerator;
import homework.day6.playground.utils.DistanceGenerator;

public class CrawlableProcessor {

    public void runCrawlable(Crawlable crawlable) {
        runCrawlable(crawlable, DirectionGenerator.generateDirection(), DistanceGenerator.generateDistance());
    }

    public void runCrawlable(Crawlable crawlable, String direction) {
        runCrawlable(crawlable, direction, DistanceGenerator.generateDistance());
    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance) {
        crawlable.crawl(direction, distance);
    }

}
