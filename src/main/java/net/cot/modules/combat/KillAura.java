package net.cot.modules.combat;

import java.util.Random;

public class KillAura {
    private final Random random = new Random();
    private final double missRate = 0.2; // 20% miss rate

    public void attack(Target target) {
        if (shouldMiss()) {
            System.out.println("Attack missed!");
            return;
        }
        // Perform the attack
        target.hit(getRandomKnockback());
    }

    private boolean shouldMiss() {
        return random.nextDouble() < missRate;
    }

    private double getRandomKnockback() {
        // Random knockback between 0.5 and 1.5
        return 0.5 + random.nextDouble();
    }
}