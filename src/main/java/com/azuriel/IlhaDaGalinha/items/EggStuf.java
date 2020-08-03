package com.azuriel.IlhaDaGalinha.items;

import com.azuriel.IlhaDaGalinha.IlhaDaGalinha;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class EggStuf extends Item {
    public EggStuf(Integer HungerValue) {
        super(new Item.Properties().group(IlhaDaGalinha.TAB).food(new Food.Builder()
                                                                        .hunger(HungerValue)
                                                                        .saturation(2.4f)
                                                                        .build()
                                                                    )
            );
    }
}
