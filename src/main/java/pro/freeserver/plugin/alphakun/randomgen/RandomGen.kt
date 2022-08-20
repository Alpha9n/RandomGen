package pro.freeserver.plugin.alphakun.randomgen

import org.bukkit.plugin.java.JavaPlugin
import pro.freeserver.plugin.alphakun.randomgen.commands.Random

class RandomGen : JavaPlugin() {
    override fun onEnable() {
        getCommand("random")?.setExecutor(Random())
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}