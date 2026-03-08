package net.civicraft.trashSystem;

import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class TrashcanCommand implements CommandExecutor {
    TrashSystem instance = TrashSystem.getInstance();
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        if (strings.length >= 1 && strings[0].equals("set")) {
            switch(strings[1]) {
                case "small":
                    //make an item a small trash can
                    break;
                case "medium":
                    //make an item a medium trash can
                    break;
                case "large":
                    //make an item a large trash can
                    break;
                default:
                    commandSender.sendMessage(Component.text("Specify a size."));
            }
        }

        if (strings.length >= 1 && strings[0].equals("reload")) {
            instance.reloadConfig();
        }
        return false;
    }
}
