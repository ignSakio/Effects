package dev.sakio.effect.effect.cmd;

import dev.sakio.effect.effect.Effect;
import dev.sakio.effect.effect.utils.commands.Command;
import dev.sakio.effect.effect.utils.commands.CommandArgs;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class StrengthCMD {
    @Command(name = "strength", inGameOnly = true, permission = "effect.strength", aliases = {"strength"})
    public void OnCommand(CommandArgs cmd) {
        Player player = cmd.getPlayer();
        String Prefix;
        String StrengthDisable;
        if (!player.hasPotionEffect(PotionEffectType.SPEED)) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 80000, Effect.getInstance().getConfig().getInt("StrengthLevel") - 1));
            Prefix = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("Prefix"));
            StrengthDisable = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("StrengthEnable"));
            player.sendMessage(String.valueOf(String.valueOf(Prefix)) + " " + StrengthDisable);
        } else if (player.hasPotionEffect(PotionEffectType.SPEED)) {
            player.removePotionEffect(PotionEffectType.SPEED);
            Prefix = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("Prefix"));
            StrengthDisable = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("StrengthDisable"));
            player.sendMessage(String.valueOf(String.valueOf(Prefix)) + " " + StrengthDisable);
        }
    }
}
