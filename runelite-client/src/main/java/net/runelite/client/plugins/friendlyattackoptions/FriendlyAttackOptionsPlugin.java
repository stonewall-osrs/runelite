package net.runelite.client.plugins.friendlyattackoptions;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Provides;
import net.runelite.api.*;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.game.ClanManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.playerindicators.PlayerIndicatorsConfig;
import net.runelite.client.util.ColorUtil;

import javax.inject.Inject;
import java.awt.*;

import static net.runelite.api.ClanMemberRank.UNRANKED;
import static net.runelite.api.MenuAction.*;

@PluginDescriptor(
        name = "Friendly Attack Options",
        description = "Removes the attack option from friendly players",
        tags = {"highlight", "minimap", "overlay", "players"}
)
public class FriendlyAttackOptionsPlugin extends Plugin
{
    @Inject
    private FriendlyAttackOptionsConfig friendlyAttackOptionsConfig;

    @Inject
    private Client client;

    @Inject
    private ClanManager clanManager;

    @Provides
    FriendlyAttackOptionsConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(FriendlyAttackOptionsConfig.class);
    }

    @Subscribe
    public void onMenuEntryAdd(MenuEntryAdded menuEntryAdded)
    {
        if (menuEntryAdded.getTarget() != null && (menuEntryAdded.getOption().startsWith("Att") || menuEntryAdded.getOption().startsWith("Fol")))
        {
         /*   if (client.isFriended(menuEntryAdded.getTarget().split(">")[1], false))
            {
                System.out.println(menuEntryAdded.getOption());
            }
            */
        }
        int type = menuEntryAdded.getType();
        MenuEntry x = new MenuEntry();
        if (type >= 2000)
        {
            type -= 2000;
        }

        int identifier = menuEntryAdded.getIdentifier();
    }

}
