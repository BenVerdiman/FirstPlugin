package tk.jangis.firstplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class CommandSpider implements CommandExecutor {
    //Adding Main class to this class

    @Override
    //On command execution
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(commandSender instanceof Player){
            Player player = (Player) commandSender;

            Block block = player.getTargetBlock(null, 20);
            block.setType(Material.COBWEB);
            if(player.getName().equals("SupremeDan")) player.sendMessage("You are pardurmen!!");






        }
        return true;
    }
}
