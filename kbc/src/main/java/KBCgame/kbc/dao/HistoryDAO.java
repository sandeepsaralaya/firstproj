package KBCgame.kbc.dao;

import java.util.List;

import KBCgame.kbc.model.History;
import KBCgame.kbc.model.Player;

public interface HistoryDAO {
	public void addToHistory(Player player) throws Exception;
	public List<History> getHistory(Player player) throws Exception;
}
