package net.lsrx7.fishy.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

//Implement the CommandExecutor Class into this Class
public class FishCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //If the command sender an Instance of Player!
        if (sender instanceof Player) {
            //Player Variable called player which is equal to
            //the sender instance Player
            Player player = (Player) sender;

            //get the player from above and send a message
            player.sendMessage("Your a Dumb dumb");

        } else {
            // Else if not instance of Player
            // Print Message to Console!
            System.out.println("Action not Possible in Console!");
        }

        //Always Return True!
        return true;
    }
}
