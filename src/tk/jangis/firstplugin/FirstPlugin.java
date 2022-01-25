package tk.jangis.firstplugin;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WelcomePlayer(), this);
        this.getCommand("kita").setExecutor(new CommandKit());
        this.getCommand("wheree").setExecutor(new CommandWhere());
        this.getCommand("rchest").setExecutor(new CommandRChest());
    }

    @Override
    public void onDisable() {

    }
}
