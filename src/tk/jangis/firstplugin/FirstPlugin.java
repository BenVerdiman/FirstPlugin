package tk.jangis.firstplugin;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin implements Listener {
    private FileConfiguration config = this.getConfig();
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WelcomePlayer(), this);
        this.getCommand("kita").setExecutor(new CommandKit());
        this.getCommand("wheree").setExecutor(new CommandWhere());
        this.getCommand("rchest").setExecutor(new CommandRChest());
        this.getCommand("sudo").setExecutor(new CommandSudo());
        this.getCommand("web").setExecutor(new CommandSpider());
        config.addDefault("DefaultSpiderDis",999999);
        config.options().copyDefaults(true);
        this.saveConfig();



    }
   public FileConfiguration con = this.getConfig();
    @Override
    public void onDisable() {

    }
}
