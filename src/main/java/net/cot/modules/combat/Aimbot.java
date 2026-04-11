package net.cot.modules.combat;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;

/**
 * Aimbot module - automatically aims at nearby players
 */
public class Aimbot {
    private boolean enabled = false;
    private float range = 50.0f;
    private float smoothness = 0.5f;

    public Aimbot() {
    }

    public void toggle() {
        this.enabled = !this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setRange(float range) {
        this.range = range;
    }

    public float getRange() {
        return this.range;
    }

    public void setSmoothness(float smoothness) {
        this.smoothness = Math.max(0.0f, Math.min(1.0f, smoothness));
    }

    public float getSmoothness() {
        return this.smoothness;
    }

    /**
     * Calculate rotation angles to aim at target
     */
    public float[] calculateRotation(PlayerEntity player, PlayerEntity target) {
        Vec3d eyePos = player.getEyePos();
        Vec3d targetPos = target.getEyePos();
        
        Vec3d diff = targetPos.subtract(eyePos);
        double distance = diff.length();
        
        float yaw = (float) Math.atan2(diff.z, diff.x) * 180 / (float) Math.PI - 90;
        float pitch = (float) -Math.atan2(diff.y, Math.sqrt(diff.x * diff.x + diff.z * diff.z)) * 180 / (float) Math.PI;
        
        return new float[]{yaw, pitch};
    }

    /**
     * Smooth aim rotation
     */
    public void applyAim(PlayerEntity player, float[] targetRotation) {
        float currentYaw = player.getYaw();
        float currentPitch = player.getPitch();
        
        float newYaw = currentYaw + (targetRotation[0] - currentYaw) * this.smoothness;
        float newPitch = currentPitch + (targetRotation[1] - currentPitch) * this.smoothness;
        
        player.setYaw(newYaw);
        player.setPitch(newPitch);
    }
}