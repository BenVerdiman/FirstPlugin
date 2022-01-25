package tk.jangis.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class CommandSudo implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {


            Player target = Bukkit.getServer().getPlayer(args[0]);
            List<String> commandArgs = new ArrayList<String>();
            for (int i = 1; i < args.length; i++) {
                commandArgs.add(args[i]);
            }
            String cmd = "/" + String.join(" ", commandArgs);
            target.chat(cmd);
            


        return true;
    }
}
