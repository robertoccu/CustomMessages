package com.psyco.tplmc.CustomMessages.configuration.defaultvariables;

import com.psyco.tplmc.CustomMessages.MessageTypes;
import com.psyco.tplmc.CustomMessages.configuration.MessageVariable;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class VariableCount extends MessageVariable {

    @Override
    public String getReplacement(Player player, MessageTypes type) {
        if (player.hasPermission("CustomMessages.morevariables")) {
            return String.valueOf(Bukkit.getOfflinePlayers().length);
        } else {
            return "";
        }
    }
}
