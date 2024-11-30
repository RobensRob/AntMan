package de.robsrob.antman.item;

import de.robsrob.antman.AntManMod;
import de.robsrob.antman.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AntManMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ANTMAN_TAB = CREATIVE_MODE_TAB.register("antman_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.antman_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.TITANIUM_INGOT.get());
                        pOutput.accept(ModBlocks.TITANIUM_BLOCK.get());
                        pOutput.accept(ModItems.BOTTLE_OF_PYM_PARTICLES.get());
                        pOutput.accept(ModItems.THROWABLE_DISC.get());
                        pOutput.accept(ModItems.SHRINK_DISC.get());
                        pOutput.accept(ModItems.GROW_DISC.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
