package tv.codely.kata.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import tv.codely.kata.gildedrose.model.*;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseShould {
    private List<IUpdateItem> listWith(IUpdateItem item) {
        List<IUpdateItem> items = new ArrayList<IUpdateItem>();
        items.add(item);
        return items;
    }

    @Test
    public void testThatSellInValueIsDecreased() {
        Item whateverItem = new Item("whatever", 10, 0);
        Generico generico = new Generico(whateverItem);

        GildedRose gildedRose = new GildedRose(listWith(generico));
        gildedRose.updateQuality();

        assertEquals(generico.getSellIn(), 9);
    }

    @Test
    public void testThatQualityValueIsDecreased() {
        Item whateverItem = new Item("whatever", 1, 10);
        Generico generico = new Generico(whateverItem);

        GildedRose gildedRose = new GildedRose(listWith(generico));
        gildedRose.updateQuality();

        assertEquals(generico.getQuality(), 9);
    }

    @Test
    public void testThatQualityDecreasesTwiceAsMuchWhenSellByIsPassed() {
        Item whateverItem = new Item("whatever", 0, 10);
        Generico generico = new Generico(whateverItem);

        GildedRose gildedRose = new GildedRose(listWith(generico));
        gildedRose.updateQuality();

        assertEquals(generico.getQuality(), 8);
    }

    @Test
    public void testThatQualityIsNeverNegative() {
        Item whateverItem = new Item("whatever", 0, 0);
        Generico generico = new Generico(whateverItem);
        GildedRose gildedRose = new GildedRose(listWith(generico));
        gildedRose.updateQuality();

        assertEquals(generico.getQuality(), 0);
    }

    @Test
    public void testAgedBrieIncreasesQualityWithAge() {
        Item agedBrie = new Item("Aged Brie", 5, 1);
        AgedBrie agedBrie1 = new AgedBrie(agedBrie);
        GildedRose gildedRose = new GildedRose(listWith(agedBrie1));
        gildedRose.updateQuality();

        assertEquals(agedBrie1.getQuality(), 2);
    }

    @Test
    public void testQualityNeverIncreasesPastFifty() {
        Item agedBrie = new Item("Aged Brie", 5, 50);
        AgedBrie agedBrie1 = new AgedBrie(agedBrie);
        GildedRose gildedRose = new GildedRose(listWith(agedBrie1));
        gildedRose.updateQuality();

        assertEquals(agedBrie1.getQuality(), 50);
    }

    @Test
    public void testSulfurasNeverChanges() {
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 0, 25);
        Sulfuras sulfuras1 = new Sulfuras(sulfuras);
        GildedRose gildedRose = new GildedRose(listWith(sulfuras1));
        gildedRose.updateQuality();

        assertEquals(sulfuras1.getQuality(), 25);
        assertEquals(sulfuras1.getSellIn(), 0);
    }

    @Test
    public void testBackstagePassIncreasesQualityByOneIfSellByGreaterThenTen() {
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20);
        BackStage backstage = new BackStage(backstagePasses);
        GildedRose gildedRose = new GildedRose(listWith(backstage));
        gildedRose.updateQuality();

        assertEquals(backstage.getQuality(), 21);
    }

    @Test
    public void testBackstagePassIncreasesQualityByTwoIfSellBySmallerThanTen() {
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 20);
        BackStage backstage = new BackStage(backstagePasses);
        GildedRose gildedRose = new GildedRose(listWith(backstage));
        gildedRose.updateQuality();

        assertEquals(backstage.getQuality(), 22);
    }

    @Test
    public void testBackstagePassIncreasesQualityByThreeIfSellBySmallerThanFive() {
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        BackStage backstage = new BackStage(backstagePasses);
        GildedRose gildedRose = new GildedRose(listWith(backstage));
        gildedRose.updateQuality();

        assertEquals(backstage.getQuality(), 23);
    }

    @Test
    public void testBackstagePassLosesValueAfterSellByPasses() {
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        BackStage backstage = new BackStage(backstagePasses);
        GildedRose gildedRose = new GildedRose(listWith(backstage));
        gildedRose.updateQuality();

        assertEquals(backstage.getQuality(), 0);
    }
}
