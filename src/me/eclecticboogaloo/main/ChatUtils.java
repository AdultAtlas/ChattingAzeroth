package me.eclecticboogaloo.main;

import org.bukkit.ChatColor;

public class ChatUtils {

	// Creates an emote with a chat color, then adds quotations for it
	public static String emotify(String s) {
		String emoteString = s;	
		if (emoteString.contains("\""))
			emoteString = ChatColor.AQUA + emoteString.substring(0, emoteString.indexOf("\"")) + ChatColor.WHITE + emoteString.substring(emoteString.indexOf("\""), emoteString.length() - 1);
		return emoteString;
	}
	
	// Does the same thing as emotify, but with a chat
	public static String chatify(String s) {
		String chatString = s;
		if (chatString.contains("*"))
			chatString = ChatColor.WHITE + chatString.substring(0, chatString.indexOf("*")) + ChatColor.AQUA + chatString.substring(chatString.indexOf("*"), chatString.length() - 1);
		return chatString;
	}
	
}
