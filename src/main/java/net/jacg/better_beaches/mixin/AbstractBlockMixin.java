package net.jacg.better_beaches.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(AbstractBlock.class)
public abstract class AbstractBlockMixin {
    @Shadow @Final protected boolean collidable;

    @Shadow @Deprecated public abstract FluidState getFluidState(BlockState state);

    @Shadow @Deprecated public abstract ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit);
    @Shadow @Deprecated public abstract VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context);
    @Shadow @Deprecated public abstract VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context);
    @Shadow @Deprecated public abstract VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos);
    @Shadow @Deprecated public abstract VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context);
}
