package net.jacg.better_beaches.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.jacg.better_beaches.BetterBeaches;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class BetterBeachesGroup {
    public static final net.minecraft.item.ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(BetterBeaches.MOD_ID, "items"), () -> new ItemStack(BetterBeaches.SAND_PILE));
}
