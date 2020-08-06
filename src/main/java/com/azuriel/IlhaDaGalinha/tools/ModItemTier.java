package com.azuriel.IlhaDaGalinha.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;


import java.util.function.Supplier;
import com.azuriel.IlhaDaGalinha.utils.ResgistryHandler;

public enum ModItemTier implements IItemTier {

    GALINHANITA(3,1000,10.0f,3.0f,12,() -> {
        return Ingredient.fromItems(ResgistryHandler.GALINHANITA.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses,float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
    {
        this.attackDamage=attackDamage;
        this.harvestLevel=harvestLevel;
        this.efficiency=efficiency;
        this.enchantability=enchantability;
        this.repairMaterial=repairMaterial;
        this.maxUses=maxUses;

    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
