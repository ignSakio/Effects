package dev.sakio.effect.effect.cmd;

import dev.sakio.effect.effect.Effect;
import dev.sakio.effect.effect.utils.commands.Command;
import dev.sakio.effect.effect.utils.commands.CommandArgs;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpeedCMD {
    @Command(name = "speed", inGameOnly = true, permission = "effect.speed", aliases = {"speed"})
    public void OnCommand(CommandArgs cmd) {
        Player player = cmd.getPlayer();
        String Prefix;
        String SpeedDisable;
        if (!player.hasPotionEffect(PotionEffectType.SPEED)) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 80000, Effect.getInstance().getConfig().getInt("SpeedLevel") - 1));
            Prefix = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("Prefix"));
            SpeedDisable = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("SpeedEnable"));
            player.sendMessage(String.valueOf(String.valueOf(Prefix)) + " " + SpeedDisable);
        } else if (player.hasPotionEffect(PotionEffectType.SPEED)) {
            player.removePotionEffect(PotionEffectType.SPEED);
            Prefix = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("Prefix"));
            SpeedDisable = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("SpeedDisable"));
            player.sendMessage(String.valueOf(String.valueOf(Prefix)) + " " + SpeedDisable);
        }
    }
}
