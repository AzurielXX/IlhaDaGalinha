package com.azuriel.IlhaDaGalinha.items;

import com.azuriel.IlhaDaGalinha.IlhaDaGalinha;
import com.azuriel.IlhaDaGalinha.utils.ResgistryHandler;
import jdk.nashorn.internal.ir.IfNode;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.BlockParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.FMLPlayMessages;

import java.rmi.registry.RegistryHandler;
import java.util.UUID;

public class GalinhaMainClass extends Item {
    public GalinhaMainClass() {
        super(new Item.Properties().group(IlhaDaGalinha.TAB));
    }

    @Override
    public boolean hitEntity(ItemStack item, LivingEntity target, LivingEntity attacker) {
        ServerWorld world = (ServerWorld)target.getEntityWorld();

        double d0 = target.getPosX() ;
        double d1 = target.getPosY() ;
        double d2 = target.getPosZ();

       if (target.getEntity() instanceof ChickenEntity){
           attacker.getEntity().sendMessage(new StringTextComponent("Você não pode ferir os deuses"),attacker.getUniqueID());
           attacker.setHealth(0f);
       }

       if (item.getItem()==ResgistryHandler.GALINHADAJESS.get() && !(target.getEntity() instanceof ChickenEntity)){
           attacker.getEntity().sendMessage(new StringTextComponent("Voce matou um(a) "+target.getDisplayName().getString()+" com o poder das galinhas"),attacker.getUniqueID());
           ((ServerWorld) target.getEntityWorld()).spawnParticle(ParticleTypes.PORTAL,d0,d1+0.5f,d2, 100, 0.6F, 0.6F, 0.6F,0.6F);

           target.setHealth(0);
       }

        return super.hitEntity(item, target, attacker);
    }
}
