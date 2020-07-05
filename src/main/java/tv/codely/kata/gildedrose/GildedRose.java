package tv.codely.kata.gildedrose;

import java.util.List;
import java.util.ArrayList;

import tv.codely.kata.gildedrose.model.IUpdateItem;


class GildedRose {
    List<IUpdateItem> items = new ArrayList<>();

    public GildedRose(List<IUpdateItem> items) {
        this.items = items;
    }

    public void updateQuality() {
        for(IUpdateItem item: items){
            item.doUpdate();
        }

    }
}
