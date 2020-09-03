package KBCgame.kbc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import KBCgame.kbc.entity.HistoryEntity;
import KBCgame.kbc.entity.PlayerEntity;
import KBCgame.kbc.model.History;
import KBCgame.kbc.model.Player;
@Repository(value="historyDAO")
public class HistoryDAOImpl implements HistoryDAO {
	@PersistenceContext
	private EntityManager em;
	@Override
	public void addToHistory(Player player) throws Exception {
		// TODO Auto-generated method stub
		List<HistoryEntity> l=new ArrayList<>();
		HistoryEntity he= null;
		List<History> hl=player.getHistory();
		if(hl!=null) {
			for(History it:hl) {
				he=new HistoryEntity();
				he.sethId(it.gethId());
				he.setScore(it.getScore());
				he.setSessionTime(it.getSessionTime());
				l.add(he);
			}
		}
		em.persist(l);
		
	}

	@Override
	public List<History> getHistory(Player player) throws Exception {
		// TODO Auto-generated method stub
		History h=null;
		List<History> l=new ArrayList<>();
		PlayerEntity pe=em.find(PlayerEntity.class, player.getpEmailId());
		List<HistoryEntity> hel=pe.getHistory();
		if(hel!=null) {
			for(HistoryEntity it:hel) {
				h=new History();
				h.sethId(it.gethId());
				h.setScore(it.getScore());
				h.setSessionTime(it.getSessionTime());
				l.add(h);
			}
		}
		
		return l;
	}
		
}
