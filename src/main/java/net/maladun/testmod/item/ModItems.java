package net.maladun.testmod.item;

import net.maladun.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> EMERALD_INGOT = ITEMS.register("emerald_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
