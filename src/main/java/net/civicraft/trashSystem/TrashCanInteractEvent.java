package net.civicraft.trashSystem;

import org.bukkit.block.Hopper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class TrashCanInteractEvent implements Listener {
    @EventHandler
    public void onTrashCanInteract(PlayerInteractEvent event) {
        if (!event.getAction().isRightClick() && !(event.getClickedBlock() instanceof Hopper && event.getClickedBlock().hasMetadata("Trash Can"))) return;


    }
}
