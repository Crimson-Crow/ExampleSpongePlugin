package com.exampledomain.examplespongeplugin;

import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

import com.google.inject.Inject;

@Plugin(id = ExampleSpongePlugin.ID)
public class ExampleSpongePlugin {
	public static final String ID = "${plugin.id}";
	public static final String NAME = "${plugin.name}";
	public static final String VERSION = "${plugin.version}";
	// public static final String DESCRIPTION = "${plugin.description}";
	// public static final String URL = "${plugin.url}";
	// public static final String[] AUTHORS = "${plugin.authors}".split(", ?");

	@Inject
	private Logger logger;

	@Listener
	public void onServerStart(GameStartedServerEvent event) {
		logger.info(String.format("Successfully enabled %s", NAME));
	}

}
