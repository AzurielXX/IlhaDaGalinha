package com.azuriel.IlhaDaGalinha;

import com.azuriel.IlhaDaGalinha.utils.ResgistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.rmi.registry.RegistryHandler;


@Mod("idg1")
public class IlhaDaGalinha
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "idg1";

    public IlhaDaGalinha() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ResgistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup TAB = new ItemGroup("ilhaDaGalinha") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ResgistryHandler.GALINHADAJESS.get());
        }
    };



}
