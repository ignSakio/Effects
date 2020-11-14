package dev.sakio.effect.effect.utils;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Utils {

    public static String BLUE;
    public static String AQUA;
    public static String YELLOW;
    public static String RED;
    public static String GRAY;
    public static String GOLD;
    public static String GREEN;
    public static String WHITE;
    public static String BLACK;
    public static String BOLD;
    public static String ITALIC;
    public static String UNDER_LINE;
    public static String STRIKE_THROUGH;
    public static String RESET;
    public static String MAGIC;
    public static String DARK_BLUE;
    public static String DARK_AQUA;
    public static String DARK_GRAY;
    public static String DARK_GREEN;
    public static String DARK_PURPLE;
    public static String DARK_RED;
    public static String PINK;
    public static String MENU_BAR;
    public static String CHAT_BAR;
    public static String SB_BAR;

    static {
        BLUE = ChatColor.BLUE.toString();
        AQUA = ChatColor.AQUA.toString();
        YELLOW = ChatColor.YELLOW.toString();
        RED = ChatColor.RED.toString();
        GRAY = ChatColor.GRAY.toString();
        GOLD = ChatColor.GOLD.toString();
        GREEN = ChatColor.GREEN.toString();
        WHITE = ChatColor.WHITE.toString();
        BLACK = ChatColor.BLACK.toString();
        BOLD = ChatColor.BOLD.toString();
        ITALIC = ChatColor.ITALIC.toString();
        UNDER_LINE = ChatColor.UNDERLINE.toString();
        STRIKE_THROUGH = ChatColor.STRIKETHROUGH.toString();
        RESET = ChatColor.RESET.toString();
        MAGIC = ChatColor.MAGIC.toString();
        DARK_BLUE = ChatColor.DARK_BLUE.toString();
        DARK_AQUA = ChatColor.DARK_AQUA.toString();
        DARK_GRAY = ChatColor.DARK_GRAY.toString();
        DARK_GREEN = ChatColor.DARK_GREEN.toString();
        DARK_PURPLE = ChatColor.DARK_PURPLE.toString();
        DARK_RED = ChatColor.DARK_RED.toString();
        PINK = ChatColor.LIGHT_PURPLE.toString();
        MENU_BAR = String.valueOf(String.valueOf(String.valueOf(ChatColor.GRAY.toString()))) + ChatColor.STRIKETHROUGH.toString() + "------------------------";
        CHAT_BAR = String.valueOf(String.valueOf(String.valueOf(ChatColor.GRAY.toString()))) + ChatColor.STRIKETHROUGH.toString() + "------------------------------------------------";
        SB_BAR = String.valueOf(String.valueOf(String.valueOf(ChatColor.GRAY.toString()))) + ChatColor.STRIKETHROUGH.toString() + "----------------------";
    }

    public Utils() {
    }

    public static ChatColor fromBukkit(ChatColor chatColor) {
        return ChatColor.values()[chatColor.ordinal()];
    }

    public static String colors(String in) {
        return ChatColor.translateAlternateColorCodes('&', in);
    }

    public static List<String> translate(List<String> lines) {
        List<String> toReturn = new ArrayList();
        Iterator var3 = lines.iterator();

        while(var3.hasNext()) {
            String line = (String)var3.next();
            toReturn.add(ChatColor.translateAlternateColorCodes('&', line));
        }

        return toReturn;
    }

    public static List<String> translate(String[] lines) {
        List<String> toReturn = new ArrayList();
        String[] var5 = lines;
        int var4 = lines.length;

        for(int var3 = 0; var3 < var4; ++var3) {
            String line = var5[var3];
            if (line != null) {
                toReturn.add(ChatColor.translateAlternateColorCodes('&', line));
            }
        }

        return toReturn;
    }

    public static String translate(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public List<String> translateFromArray(List<String> text) {
        List<String> messages = new ArrayList();
        Iterator var4 = text.iterator();

        while(var4.hasNext()) {
            String string = (String)var4.next();
            messages.add(translate(string));
        }

        return messages;
    }

    public static String translateAlternateColorCodes(String string) {
        return null;
    }
}
