package net.cot.modules;

import java.util.ArrayList;
import java.util.List;

/**
 * ModuleManager class to manage all modules in the repository.
 */
public class ModuleManager {
    private List<String> modules;

    public ModuleManager() {
        modules = new ArrayList<>();
    }

    /**
     * Adds a module to the manager.
     * @param module The name of the module to add.
     */
    public void addModule(String module) {
        modules.add(module);
    }

    /**
     * Removes a module from the manager.
     * @param module The name of the module to remove.
     */
    public void removeModule(String module) {
        modules.remove(module);
    }

    /**
     * Gets the list of all modules.
     * @return A list of module names.
     */
    public List<String> getModules() {
        return modules;
    }
}