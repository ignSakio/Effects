package dev.sakio.effect.effect;

import dev.sakio.effect.effect.cmd.FireresCMD;
import dev.sakio.effect.effect.cmd.SpeedCMD;
import dev.sakio.effect.effect.utils.commands.CommandFramework;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public final class Effect extends JavaPlugin implements Listener {
    @Getter
    public static Effect instance;
    public static Effect plugin;

    public Effect() {
    }

    public void onEnable() {
        instance = this;
        plugin = this;
        this.registerCommands();
        this.saveDefaultConfig();
        this.reloadConfig();
    }
    public void registerCommands() {
        this.registerCommands(
                new FireresCMD(),
                new SpeedCMD()
        );
    }


    public void onDisable() {
    }
    private void registerCommands(Object... command) {
        CommandFramework commandFramework = new CommandFramework(this);
        Arrays.stream(command).forEach(commandFramework::registerCommands);

    }
}
