package com.azuriel.IlhaDaGalinha.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StonePath extends Block {
    public StonePath() {
        super(
                Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3.0f, 5.0f)
                    .sound(SoundType.STONE)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
        );
    }
}
