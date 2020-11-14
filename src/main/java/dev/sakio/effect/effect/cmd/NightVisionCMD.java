package dev.sakio.effect.effect.cmd;

import dev.sakio.effect.effect.Effect;
import dev.sakio.effect.effect.utils.commands.Command;
import dev.sakio.effect.effect.utils.commands.CommandArgs;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NightVisionCMD {
    @Command(name = "nightvision", inGameOnly = true, permission = "effect.nigthvision", aliases = {"nv"})
    public void OnCommand(CommandArgs cmd) {
        Player player = cmd.getPlayer();
        String Prefix;
        String NightVisionDisable;
        if (!player.hasPotionEffect(PotionEffectType.FIRE_RESISTANCE)) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 80000, Effect.getInstance().getConfig().getInt("NightVisionLevel") - 1));
            Prefix = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("Prefix"));
            NightVisionDisable = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("NightVisionEnable"));
            player.sendMessage(String.valueOf(String.valueOf(Prefix)) + " " + NightVisionDisable);
        } else if (player.hasPotionEffect(PotionEffectType.FIRE_RESISTANCE)) {
            player.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
            Prefix = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("Prefix"));
            NightVisionDisable = ChatColor.translateAlternateColorCodes('&', Effect.getInstance().getConfig().getString("NightVisionDisable"));
            player.sendMessage(String.valueOf(String.valueOf(Prefix)) + " " + NightVisionDisable);
        }
    }
}
