package codes.domino.rightclickharvest4spigot;

import codes.domino.rightclickharvest4spigot.listener.RightClickBlockListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class RightClickHarvest4Spigot extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new RightClickBlockListener(), this);
    }
}
