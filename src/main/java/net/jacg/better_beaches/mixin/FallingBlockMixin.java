package net.jacg.better_beaches.mixin;

import net.minecraft.block.*;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Debug(export = true)
@Mixin(FallingBlock.class)
public abstract class FallingBlockMixin extends BlockMixin implements LandingBlock {
    public FallingBlockMixin(Settings settings) {
        super(settings);
    }

    @Shadow protected abstract void configureFallingBlockEntity(FallingBlockEntity entity);
}
