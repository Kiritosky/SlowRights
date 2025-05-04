package plugin.slowRights;

import commands.rechtecommand;
import listeners.GuiClickListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlowRights extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SlowRights plugin enabled");

        //Listeners
        getServer().getPluginManager().registerEvents(new GuiClickListener(), this);

        //Commands
        getCommand("rechte").setExecutor(new rechtecommand(this));

        //Config
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("SlowRights plugin disabled");
    }
}