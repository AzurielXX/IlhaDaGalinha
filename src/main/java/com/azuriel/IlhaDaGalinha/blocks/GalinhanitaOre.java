package com.azuriel.IlhaDaGalinha.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GalinhanitaOre extends Block {
    public GalinhanitaOre() {
        super(
                Properties.create(Material.IRON)
                    .hardnessAndResistance(3.5f, 15.0f)
                    .sound(SoundType.STONE)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
        );
    }
}
