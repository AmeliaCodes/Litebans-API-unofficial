package dev.xwand.litebansapi;

import dev.xwand.litebansapi.manager.HistoryManager;
import litebans.api.Database;

/**
 * @author xWand
 */
public class LitebansAPI {

    private final HistoryManager historyManager;
    public LitebansAPI(Database database) {
        historyManager = new HistoryManager(database);
    }

    public HistoryManager getHistoryManager() {
        return historyManager;
    }
}
