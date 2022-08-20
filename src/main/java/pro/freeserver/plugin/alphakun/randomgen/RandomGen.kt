package pro.freeserver.plugin.alphakun.randomgen

import org.bukkit.plugin.java.JavaPlugin
import pro.freeserver.plugin.alphakun.randomgen.commands.RandomCommand

class RandomGen : JavaPlugin() {
    override fun onEnable() {
        loadCommand()
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    private fun loadCommand() {
        getCommand("random")!!.setExecutor(RandomCommand())
    }
}