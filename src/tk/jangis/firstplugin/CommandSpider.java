package tk.jangis.firstplugin;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSpider implements CommandExecutor {
    //Adding Main class to this class

    @Override
    //On command execution
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(commandSender instanceof Player){
                Player player = (Player) commandSender;

            try {
                if(args[0].equals("set")){
                    int distance = Integer.parseInt(args[1]);
                    FirstPlugin.plugin.getConfig().set(player.getName()+"SpiderDis",distance);
                }
            }catch (ArrayIndexOutOfBoundsException e){
                return true;
            }

                FirstPlugin.plugin.getConfig().addDefault(player.getName() + "SpiderDis", 5);
                FirstPlugin.plugin.getConfig().options().copyDefaults(true);
                FirstPlugin.plugin.saveConfig();
                Block block = player.getTargetBlock(null, FirstPlugin.plugin.getConfig().getInt(player.getName() + "SpiderDis"));
                block.setType(Material.COBWEB);


                if (player.getName().equals("SupremeDan")) player.sendMessage("You are pardurmen!!");



        }
        return true;
    }
}