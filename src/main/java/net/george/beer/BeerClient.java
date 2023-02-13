package net.george.beer;

import net.fabricmc.api.ClientModInitializer;

public class BeerClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        beer.LOGGER.debug("Registering Mod Items for " + beer.MOD_ID);
    }
}
