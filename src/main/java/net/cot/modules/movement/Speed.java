package net.cot.modules.movement;

import net.minecraft.entity.player.PlayerEntity;

/**
 * Speed module - increases player movement speed
 */
public class Speed {
    private boolean enabled = false;
    private float speedMultiplier = 2.0f;

    public Speed() {
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

    public void setSpeedMultiplier(float multiplier) {
        this.speedMultiplier = multiplier;
    }

    public float getSpeedMultiplier() {
        return this.speedMultiplier;
    }

    public void update(PlayerEntity player) {
        if (!this.enabled || player == null) return;

        // Increase movement speed
        if (player.getVelocity().length() > 0) {
            player.addVelocity(
                player.getVelocity().x * (this.speedMultiplier - 1),
                0,
                player.getVelocity().z * (this.speedMultiplier - 1)
            );
        }
    }
}