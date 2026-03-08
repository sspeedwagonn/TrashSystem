package net.civicraft.trashSystem;

import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class TrashSystem extends JavaPlugin {
    static TrashSystem instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        registerRecipe();
        saveDefaultConfig();
    }

    @SuppressWarnings("UnstableApiUsage")
    private void registerRecipe() {
        NamespacedKey key = new NamespacedKey(this, "trashcan");

        ItemStack item = ItemStack.of(Material.HOPPER);
        item.setData(DataComponentTypes.ITEM_NAME, Component.text("Trash Can", NamedTextColor.GRAY));

        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("B B", "B B", "III");
        recipe.setIngredient('B', Material.IRON_BARS);
        recipe.setIngredient('I', Material.IRON_INGOT);

        getServer().addRecipe(recipe);
    }

    public static TrashSystem getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
