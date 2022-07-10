package dev.xwand.litebansapi.punishment;

import lombok.Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

@Data
public class Punishment {

    private final long id;
    private final String uuid;
    private final String ip;
    private final String reason;
    private final String executorUUID;
    private final String executorName;
    private String removedByUUID;
    private String removedByName;
    private String removedReason;
    private Date removedDate;
    private final long createdAt;
    private final long expiresAt;
    private final short template;
    private final String serverScope;
    private final String serverOrigin;
    private final boolean silent;
    private final boolean ipBan;
    private final boolean ipBanWildcard;
    private final boolean active;
    private boolean warned;

    public Punishment(final ResultSet rs) throws SQLException {
        this.id = rs.getLong("id");
        this.uuid = rs.getString("uuid");
        this.ip = rs.getString("ip");
        this.reason = rs.getString("reason");
        this.executorUUID = rs.getString("banned_by_uuid");
        this.executorName = rs.getString("banned_by_name");
        this.createdAt = rs.getLong("time");
        this.expiresAt = rs.getLong("until");
        this.template = rs.getShort("template");
        this.serverScope = rs.getString("server_scope");
        this.serverOrigin = rs.getString("server_origin");
        this.silent = rs.getBoolean("silent");
        this.ipBan = rs.getBoolean("ipban");
        this.ipBanWildcard = rs.getBoolean("ipban_wildcard");
        this.active = rs.getBoolean("active");
    }
}

