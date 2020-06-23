package net.lsrx7.fishy;

import net.lsrx7.fishy.commands.FishCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fishy extends JavaPlugin {

    // On Plugin enable do this!
    @Override
    public void onEnable() {

        //Print to the Console when plugin started!
        System.out.println("Fishy Plugin Booted!");

        //Get the Command and set its Execution to the FishCommand class!
        getCommand("fish").setExecutor(new FishCommand());

    }
}
