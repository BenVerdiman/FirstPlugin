package tk.jangis.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandWhere implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
       if (commandSender instanceof Player) {
           Player player = (Player) commandSender;
           int location = (int) player.getLocation().getX();
           Bukkit.broadcastMessage("Player with name: " + player.getName() + " executed command where! His location is: " + location);

       }
        return true;
    }
}
