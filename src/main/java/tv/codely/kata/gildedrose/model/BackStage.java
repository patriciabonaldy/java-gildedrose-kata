package tv.codely.kata.gildedrose.model;

public class BackStage extends UpdateItem implements IUpdateItem {


    public BackStage(Item item) {
        super(item);
    }


    @Override
    public void doUpdate() {
        setQualityInItem();
        decreSellIn();;
        if (getSellIn() < MIN_QUALITY ) {
            setQuality(MIN_QUALITY);
        }
    }
}