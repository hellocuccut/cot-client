package net.cot.keybinds;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWKeyCallback;

public class KeyBindManager {
    private static final int KEY_RIGHT_SHIFT = GLFW.GLFW_KEY_RIGHT_SHIFT;

    public static void registerKeyBindings() {
        GLFW.glfwSetKeyCallback(window, new GLFWKeyCallback() {
            @Override
            public void invoke(long window, int key, int scancode, int action, int mods) {
                if (key == KEY_RIGHT_SHIFT && action == GLFW.GLFW_PRESS) {
                    handleRightShiftPress();
                }
            }
        });
    }

    private static void handleRightShiftPress() {
        // Add your handling logic here
        System.out.println("Right Shift key pressed!");
    }
}