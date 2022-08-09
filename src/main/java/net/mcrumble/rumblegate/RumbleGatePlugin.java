package net.mcrumble.rumblegate;

import org.bukkit.plugin.java.JavaPlugin;

public class RumbleGatePlugin extends JavaPlugin
{

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new RumbleGateListener(this), this);
	}
}
