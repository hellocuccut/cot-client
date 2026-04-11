package net.cot.gui;

public class AnimationUtils {
    /**
     * Computes the eased-out value.
     * @param start - the starting value
     * @param end - the end value
     * @param progress - the progress (0.0 - 1.0)
     * @return the eased out value
     */
    public static float easeOut(float start, float end, float progress) {
        float t = progress;
        return start + (end - start) * (1 - (t * t));
    }

    /**
     * Computes the ease-in-out value.
     * @param start - the starting value
     * @param end - the end value
     * @param progress - the progress (0.0 - 1.0)
     * @return the eased in-out value
     */
    public static float easeInOut(float start, float end, float progress) {
        float t = progress * 2;
        if (t < 1) return start + (end - start) * 0.5f * t * t;
        t--;
        return start + (end - start) * (0.5f * (t * (t + 2)));
    }

    /**
     * Performs linear interpolation between two values.
     * @param start - the starting value
     * @param end - the end value
     * @param progress - the progress (0.0 - 1.0)
     * @return the interpolated value
     */
    public static float lerp(float start, float end, float progress) {
        return start + (end - start) * progress;
    }
}