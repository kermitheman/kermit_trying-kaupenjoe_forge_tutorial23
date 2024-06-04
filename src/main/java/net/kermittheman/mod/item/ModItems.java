package net.kermittheman.mod.item;

import net.kermittheman.mod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public  static  final DeferredRegister<Item> ITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);


    public static final RegistryObject<Item> SAPPHIRE = ITEM.register("sapphire" ,
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BANANA = ITEM.register("banana" ,
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }



}
