package dev.sakio.effect.effect.cmd;

import dev.sakio.effect.effect.Effect;
import dev.sakio.effect.effect.utils.commands.Command;
import dev.sakio.effect.effect.utils.commands.CommandArgs;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class HasteCMD {
    @Command(name = "haste", inGameOnly = true, permission = "effect.haste", aliases = {"haste"})
    public void OnCommand(CommandArgs cmd) {
        Player player = cmd.getPlayer();
        String Prefix;
        String HasteDisable;
        if (!player.hasPotionEffect(PotionEffectType.SPEED)) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 80000, Effect.getInstance().getConfig().getInt("HasteLevel") - 1));
            Prefix = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("Prefix"));
            HasteDisable = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("HasteEnable"));
            player.sendMessage(String.valueOf(String.valueOf(Prefix)) + " " + HasteDisable);
        } else if (player.hasPotionEffect(PotionEffectType.SPEED)) {
            player.removePotionEffect(PotionEffectType.SPEED);
            Prefix = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("Prefix"));
            HasteDisable = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("HasteDisable"));
            player.sendMessage(String.valueOf(String.valueOf(Prefix)) + " " + HasteDisable);
        }
    }
}
