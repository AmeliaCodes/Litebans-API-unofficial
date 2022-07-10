package dev.xwand.litebansapi.manager;

import dev.xwand.litebansapi.punishment.Punishment;
import litebans.api.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author xWand
 */

public final class HistoryManager {

    private final Database database;

    public HistoryManager(final Database database) {
        this.database = database;
    }

    public List<Punishment> getBans(final UUID uuid) {

        final List<Punishment> bans = new LinkedList<>();
        final String query = "SELECT * FROM {bans} WHERE uuid=?";

        CompletableFuture.runAsync(() -> {
            try (PreparedStatement st = this.database.prepareStatement(query)) {
                st.setString(1, uuid.toString());
                try (final ResultSet rs = st.executeQuery()) {
                    while (rs.next()) {
                        bans.add(new Punishment(rs));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
        return bans;
    }
}
