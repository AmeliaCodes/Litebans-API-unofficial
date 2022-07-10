package dev.xwand.litebansapi;

import dev.xwand.litebansapi.manager.HistoryManager;
import litebans.api.Database;

/**
 * @author xWand
 */

public class LitebansAPI {

    private final HistoryManager historyManager;

    public LitebansAPI(final Database database) {
        this.historyManager = new HistoryManager(database);
    }

    public HistoryManager getHistoryManager() {
        return this.historyManager;
    }
}
