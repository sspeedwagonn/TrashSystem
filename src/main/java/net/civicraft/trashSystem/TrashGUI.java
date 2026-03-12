package net.civicraft.trashSystem;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class TrashGUI {
    public void openGUI(Player player) {
        Inventory gui = Bukkit.createInventory(null, 9, Component.text("Trash Can"));

        player.openInventory(gui);
    }
}
