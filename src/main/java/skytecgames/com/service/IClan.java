package skytecgames.com.service;

import skytecgames.com.model.ClanAddGoldDTO;
import skytecgames.com.model.ClanDTO;
import skytecgames.com.model.TastComplitedDTO;

public interface IClan {
    ClanDTO getClan(long id);
    ClanAddGoldDTO addingGold(long id, int gold);

    TastComplitedDTO completeTask(long taskId, long id);

}
