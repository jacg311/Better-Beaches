package net.jacg.better_beaches;

import net.fabricmc.api.ModInitializer;
import net.jacg.better_beaches.item.BetterBeachesGroup;
import net.jacg.better_beaches.item.SandPile;
import net.jacg.better_beaches.worldgen.BBRegion;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.RegionType;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class BetterBeaches implements ModInitializer, TerraBlenderApi {
    public static final String MOD_ID = "better_beaches";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item SAND_SHOVEL = Registry.register(Registry.ITEM, id("sand_shovel"), new Item(new Item.Settings().maxCount(1).group(BetterBeachesGroup.ITEM_GROUP).maxDamage(3500)));
    public static final Item SAND_PILE = Registry.register(Registry.ITEM, id( "sand_pile"), new SandPile(new Item.Settings().group(BetterBeachesGroup.ITEM_GROUP), new Identifier("sand")));
    public static final Item RED_SAND_PILE = Registry.register(Registry.ITEM, id("red_sand_pile"), new SandPile(new Item.Settings().group(BetterBeachesGroup.ITEM_GROUP), new Identifier("red_sand")));

    @Override
    public void onInitialize() {
        LOGGER.info("Making beaches prettier..");

        System.out.println(Blocks.SAND);
    }

    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new BBRegion(id("better_beach"), RegionType.OVERWORLD, 2) );
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
