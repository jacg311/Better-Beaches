package net.jacg.better_beaches.mixin;

import net.jacg.better_beaches.BetterBeaches;
import net.jacg.better_beaches.util.SandBlockAccess;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

@Debug(export = true)
@Mixin(Blocks.class)
public class BlocksMixin {

    @ModifyArg(
            slice = @Slice(
                from = @At(value = "CONSTANT", args = "stringValue=sand")
            ),
            method = "<clinit>",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/block/Blocks;register(Ljava/lang/String;Lnet/minecraft/block/Block;)Lnet/minecraft/block/Block;",
                    ordinal = 0
            ),
            index = 1)
    private static Block betterBeachesAddSandItem(Block block) {
        ((SandBlockAccess)block).setBelongsTo(BetterBeaches.SAND_PILE);
        return block;
    }

    @ModifyArg(
            slice = @Slice(
                    from = @At(value = "CONSTANT", args = "stringValue=red_sand")
            ),
            method = "<clinit>",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/block/Blocks;register(Ljava/lang/String;Lnet/minecraft/block/Block;)Lnet/minecraft/block/Block;",
                    ordinal = 0
            ),
            index = 1)
    private static Block betterBeachesAddRedSandItem(Block block) {
        ((SandBlockAccess)block).setBelongsTo(BetterBeaches.RED_SAND_PILE);
        return block;
    }
}
