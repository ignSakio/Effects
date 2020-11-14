package dev.sakio.effect.effect.cmd;

import dev.sakio.effect.effect.Effect;
import dev.sakio.effect.effect.utils.Color;
import dev.sakio.effect.effect.utils.commands.Command;
import dev.sakio.effect.effect.utils.commands.CommandArgs;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FireresCMD {
    @Command(name = "fireres", inGameOnly = true, permission = "effect.fire", aliases = {"fireresistan"})
    public void OnCommand(CommandArgs cmd) {
        Player player = cmd.getPlayer();
        String Prefix;
        String FireResDisable;
        if (!player.hasPotionEffect(PotionEffectType.FIRE_RESISTANCE)) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 80000, Effect.getInstance().getConfig().getInt("FireResLevel") - 1));
            Prefix = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("Prefix"));
            FireResDisable = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("FireResEnable"));
            player.sendMessage(String.valueOf(String.valueOf(Prefix)) + " " + FireResDisable);
        } else if (player.hasPotionEffect(PotionEffectType.FIRE_RESISTANCE)) {
            player.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
            Prefix = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("Prefix"));
            FireResDisable = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("FireResDisable"));
            player.sendMessage(String.valueOf(String.valueOf(Prefix)) + " " + FireResDisable);
        }
    }
}

