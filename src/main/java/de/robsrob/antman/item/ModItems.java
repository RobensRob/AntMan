package de.robsrob.antman.item;

import de.robsrob.antman.AntManMod;
import de.robsrob.antman.item.custom.ThrowableDiscItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AntManMod.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOTTLE_OF_PYM_PARTICLES = ITEMS.register("bottle_of_pym_particles", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> THROWABLE_DISC = ITEMS.register("throwable_disc", () -> new ThrowableDiscItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
