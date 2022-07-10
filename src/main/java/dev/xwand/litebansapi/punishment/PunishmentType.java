package dev.xwand.litebansapi.punishment;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author xWand
 */
@Getter
@AllArgsConstructor

public enum PunishmentType {

    BAN(true),
    MUTE(true),
    KICK(false),
    WARNING(true);

    private final boolean removable;
}
