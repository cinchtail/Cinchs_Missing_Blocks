package net.cinchtail.cinchsmissingblocks.mixins;

import net.cinchtail.cinchsmissingblocks.config.ModConfigs;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class MixinPluginConfig implements IMixinConfigPlugin {

    @Override
    public void onLoad(String mixinPackage) {
        ModConfigs.load();
    }
    @Override
    public String getRefMapperConfig() {
        return null;
    }
    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if (mixinClassName.endsWith("enableTuffBrickPillar")) {
            return ModConfigs.enableTuffBrickPillar;
        }
        return true;
    }
    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {}

    @Override
    public List<String> getMixins() {
        return null;
    }
    @Override
    public void preApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }
    @Override
    public void postApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {
    }
}