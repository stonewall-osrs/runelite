package net.runelite.client.plugins.friendlyattackoptions;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("friendlyAttackOptions")
public interface FriendlyAttackOptionsConfig extends Config
{
        @ConfigItem(
                position = 0,
                keyName = "removeAttackFriends",
                name = "Remove Attack Option from friends",
                description = "Removes the attack option from players on your friendlist "
        )
        default boolean removeAttackFriends()
        {
            return true;
        }

    }
