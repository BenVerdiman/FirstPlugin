package tk.jangis.firstplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            ItemStack barrier = new ItemStack(Material.BARRIER);
            barrier.setAmount(64);
            player.getInventory().addItem(barrier);
            ItemStack diamond = new ItemStack(Material.DIAMOND, 64);
            player.getInventory().addItem(diamond);

        }
        return true;
    }

}
