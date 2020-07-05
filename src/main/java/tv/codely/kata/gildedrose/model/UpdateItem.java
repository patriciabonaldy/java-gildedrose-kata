package tv.codely.kata.gildedrose.model;

import tv.codely.kata.gildedrose.model.Item;

public class UpdateItem extends Item {


    public UpdateItem(Item item) {
        super(item.getName(), item.getSellIn(), item.getQuality());
    }

    public void setQualityInItem(){
        if (getQuality() < MAX_QUALITY) {
            setQuality(getQuality() + 1);
        }
    }

}