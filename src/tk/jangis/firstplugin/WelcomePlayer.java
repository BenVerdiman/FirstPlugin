package tk.jangis.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class WelcomePlayer implements Listener {
    public void onPlayerJoin(PlayerJoinEvent pjoin){
        Bukkit.broadcastMessage("Welcome, " + pjoin.getPlayer().getName());
    }

}
