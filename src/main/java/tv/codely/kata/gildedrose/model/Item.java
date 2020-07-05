package tv.codely.kata.gildedrose.model;

public class Item {
    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;
    private String name;
    private int sellIn;
    private int quality;




    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void decreQuality(){
        this.quality = this.quality-1;
    }

    public void decreSellIn(){
        this.sellIn = this.sellIn-1;
    }

    public void incQuality(){
        this.quality = this.quality+1;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
