package tv.codely.kata.gildedrose.model;

public class Generico extends Item implements IUpdateItem {

    private Item item;

    public Generico(Item item) {
        super(item.getName(), item.getSellIn(), item.getQuality());
        this.item = item;
    }


    @Override
    public void doUpdate() {
        if (getQuality() > 0) {
            decreQuality();
            decreSellIn();
        }
        if (getSellIn() < MIN_QUALITY && getQuality() > MIN_QUALITY) {
            decreQuality();
        }
    }
}