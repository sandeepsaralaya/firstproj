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

@Repository(value="newPlayerDAO")
public class NewPlayerDAOImpl implements NewPlayerDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void addPlayer(Player player) throws Exception {
		// TODO Auto-generated method stub
		PlayerEntity pe=new PlayerEntity();
		HistoryEntity he=null;
		pe.setpEmailId(player.getpEmailId());
		pe.setpName(player.getpName());
		
		List<History> h1=player.getHistory();
		List<HistoryEntity> hst = new ArrayList<>();
		if(h1!=null) {
			for(History h: h1) {
				he=new HistoryEntity();
				he.sethId(h.gethId());
				he.setScore(h.getScore());
				he.setSessionTime(h.getSessionTime());
				hst.add(he);
			}
		}
		pe.setHistory(hst);
		entityManager.persist(pe);
			}
		
		
	
	
}
