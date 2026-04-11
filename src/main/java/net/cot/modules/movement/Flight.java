package net.cot.modules.movement;

import net.minecraft.entity.player.PlayerEntity;

/**
 * Flight module - allows player to fly
 */
public class Flight {
    private boolean enabled = false;
    private float speed = 0.5f;

    public Flight() {
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

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void update(PlayerEntity player) {
        if (!this.enabled || player == null) return;

        // Set player abilities
        player.getAbilities().flying = true;
        player.getAbilities().setFlySpeed(this.speed);
    }

    public void disable(PlayerEntity player) {
        if (player != null) {
            player.getAbilities().flying = false;
        }
    }
}