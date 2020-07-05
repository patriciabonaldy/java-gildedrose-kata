package tv.codely.kata.gildedrose.model;

public class Sulfuras extends UpdateItem implements IUpdateItem {


    public Sulfuras(Item item){
        super(item);
    }


    @Override
    public void doUpdate() {
        super.setQualityInItem();
    }
}