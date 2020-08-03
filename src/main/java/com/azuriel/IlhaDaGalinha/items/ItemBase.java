package com.azuriel.IlhaDaGalinha.items;

import com.azuriel.IlhaDaGalinha.IlhaDaGalinha;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(IlhaDaGalinha.TAB));
    }
}
