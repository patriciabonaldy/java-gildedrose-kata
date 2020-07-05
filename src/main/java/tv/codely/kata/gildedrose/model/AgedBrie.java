package tv.codely.kata.gildedrose.model;

public class AgedBrie extends UpdateItem implements IUpdateItem {

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void doUpdate() {
        setQualityInItem();
        decreSellIn();;
        if (getSellIn() < MIN_QUALITY && getQuality()  < MAX_QUALITY) {
            incQuality();
        }
    }
}