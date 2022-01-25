package tk.jangis.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CommandRChest implements CommandExecutor {
    ///Minimum and maximum range of cordinates
    int minx = 200;
    int maxx = 1220;
    int miny = 40;
    int maxy = 80;
    int minz = 40;
    int maxz = 80;
    //Creating cordinate's variables
    int x=0;
    int y=0;
    int z=0;
    //The code above is ran after execution of the command
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(commandSender instanceof Player){
            //Getting the player which execute our command
            Player player = (Player) commandSender;
            RandomClass randomClass = new RandomClass();
            //Creating random cordinates
            x= randomClass.randomInt(minx,maxx);
            y=randomClass.randomInt(miny,maxy);
            z=randomClass.randomInt(minz,maxz);
            //Creating location variable
            Location location = new Location(player.getWorld(), x,y,z);
            //Getting the type of block at the generated cordinates and change it to a chest
            location.getBlock().setType(Material.CHEST);
            //Getting the chest block
            Block chestBlock = location.getBlock();
            Chest chest = (Chest) chestBlock.getState();
            //Inventory variable connected to the chest inventory
            Inventory inventory = chest.getInventory();
            //Adding one diamond to the chest
            ItemStack diamond = new ItemStack(Material.DIAMOND);
            ItemStack stacknethblock = new ItemStack(Material.NETHERITE_BLOCK, 64);
            inventory.addItem(diamond, stacknethblock);

            //Broadcasting message to all players
            Bukkit.broadcastMessage("Chest spawned at x: " + x + " y: " + y + " z: " + z);

        }
        return true;
    }
}
