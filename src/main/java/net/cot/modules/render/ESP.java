package net.cot.modules.render;

import net.minecraft.entity.player.PlayerEntity;
import java.util.List;

/**
 * ESP module - highlights nearby players through walls
 */
public class ESP {
    private boolean enabled = false;
    private float range = 100.0f;
    private int color = 0xFF0000; // Red color

    public ESP() {
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

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return this.color;
    }

    /**
     * Get nearby players within range
     */
    public List<PlayerEntity> getNearbyPlayers(PlayerEntity player, List<PlayerEntity> allPlayers) {
        return allPlayers.stream()
                .filter(p -> p != player && !p.isSpectator())
                .filter(p -> player.distanceTo(p) <= this.range)
                .toList();
    }
}