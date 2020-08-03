package com.azuriel.IlhaDaGalinha.utils;

import com.azuriel.IlhaDaGalinha.IlhaDaGalinha;
import com.azuriel.IlhaDaGalinha.blocks.BlockItemBase;
import com.azuriel.IlhaDaGalinha.blocks.GalinhanitaOre;
import com.azuriel.IlhaDaGalinha.blocks.StonePath;
import com.azuriel.IlhaDaGalinha.items.EggStuf;
import com.azuriel.IlhaDaGalinha.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ResgistryHandler {
    public static  DeferredRegister<Item> ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS,IlhaDaGalinha.MOD_ID);
    public static  DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,IlhaDaGalinha.MOD_ID);



    public static void init()
    {
      ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
      BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());


    }

    //item
        //O nome do item no register tem que ser em minusculo
    public static final RegistryObject<Item> GALINHADAJESS =  ITEMS.register("galinha_da_jess", ItemBase::new);
    public static final RegistryObject<EggStuf> FRIED_EGG =  ITEMS.register("fried_egg",() -> new EggStuf(5));
    public static final RegistryObject<Item> BUCKET_EGG =  ITEMS.register("egg_bucket",ItemBase::new);
    public static final RegistryObject<EggStuf> COOKED_EGG =  ITEMS.register("cooked_egg",() -> new EggStuf(8));



    //Block
   // public static final RegistryObject<Block> STONE_PATH =  BLOCKS.register("stone_path", StonePath::new);
   public static final RegistryObject<Block> GALINHANITA =  BLOCKS.register("galinhanita_ore", GalinhanitaOre::new);




    //BLock Item
   // public static final RegistryObject<Item> STONE_PATH_ITEM =  ITEMS.register("stone_path", () -> new BlockItemBase(STONE_PATH.get()));
   public static final RegistryObject<Item> GALINHANITA_ITEM =  ITEMS.register("galinhanita_ore", () -> new BlockItemBase(GALINHANITA.get()));

}
