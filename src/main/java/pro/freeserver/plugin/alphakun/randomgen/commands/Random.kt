package pro.freeserver.plugin.alphakun.randomgen.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class Random: CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        if (command.label.equals("random", true)){
            if (args?.size == 0) {
                sender.sendMessage("----- [§aRandomGen§f] -----")
                sender.sendMessage("§b/random§f: このヘルプを表示")
                sender.sendMessage("§b/random [1-1000]§f: 数値の中でランダムに数字を返す")
            } else if (args?.size!! >= 1) {
                try {
                    val max: Int = args[0].toInt()
                    if (max in 1..1000) {
                        val range = (1..max)
                        sender.sendMessage("[§aRandomGen§f]: 結果は${range.random()}です")
                    } else {
                        throw IndexOutOfBoundsException("")
                    }
                } catch (e: Exception) {
                    sender.sendMessage("[§aRandomGen§f]: 1-1000の数値で入力してください")
                }
            }
            return true
        }
        return false
    }
}